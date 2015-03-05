<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${the_title} - ${company_name}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	${theme.include(top_head_include)}
</head>
<#if the_title="sign-in">
<body class="${css_class} sign-in">
<#else>
<body class="${css_class} dockbar-split">
</#if>

<a href="#main-content" id="skip-to-content">
	<span class="aui-helper-hidden-accessible"><@liferay.language key="skip-to-content" />
	</span>
</a>

${theme.include(body_top_include)}

<#if is_signed_in>
	<@liferay.dockbar />
</#if>
<#if the_title = "Welcome">
<#include "${full_templates_path}/home_page.ftl" />
<#else>
<div class="container-fluid" id="wrapper">
	<header id="banner" role="banner">
		<#if show_heading = true>
		<div id="heading">
			<h1 class="site-title">
			<div class="logo">
				<a class="${logo_css_class}" href="${site_default_url}" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
					<img alt="${logo_description}" height="${site_logo_height}" src="${site_logo}" width="${site_logo_width}" />
				</a>
			</div>
				<#if show_site_name>
					<span class="site-name" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
						${site_name}
					</span>
				</#if>
			</h1>
		</div>
		</#if>
		<#if has_navigation || is_signed_in>
			<#if show_navigation = true>
			<#include "${full_templates_path}/navigation.ftl" />
			</#if>
		</#if>
	</header>
		<#if show_page_title>	
		<div class="page-title">
			<h2 class="page-title">
			<span>${the_title}</span>
			</h2>
		</div>
		</#if>
	
		<#if !show_page_title>
	<div id="content-not-home-no-page-title">
		<#else>
	<div id="content-not-home">
		</#if>
	
		<#if show_breadcrumbs = true>
			<nav id="breadcrumbs"><@liferay.breadcrumbs /></nav>
		</#if>
		<#if selectable>
			${theme.include(content_include)}
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			${theme.wrapPortlet("portlet.ftl", content_include)}
		</#if>
	</div>
	<#if show_footer = true>
	<hr>
	<footer id="footer" role="contentinfo">
		<div class="footer-content">
	<nav class="footer-navigation">
	<#include "${full_templates_path}/footer_navigation.ftl" />
	</nav>
		
	<#if show_social_media = true>
		<div class="social-media-wrapper">
		<h3 class="nav-heading">
			Follow Us
		</h3>

		<ul>
			<li>
				<a class="facebook social-icon" href="http://www.facebook.com/pages/Liferay/45119213107" target="_blank"><span class="hide">Facebook</span></a>
			</li>
			<li>
				<a class="social-icon twitter" href="http://www.twitter.com/liferay" target="_blank"><span class="hide">Twitter</span></a>
			</li>
			<li>
				<a class="linkedin social-icon" href="http://www.linkedin.com/company/83609" target="_blank"><span class="hide">LinkedIn</span></a>
			</li>
			<li>
				<a class="social-icon youtube" href="http://www.youtube.com/user/liferayinc" target="_blank"><span class="hide">YouTube</span></a>
			</li>
			<li>
				<a class="rss social-icon" href="http://www.liferay.com/community/blogs" target="_blank"><span class="hide">Bloogs</span></a>
			</li>
		</ul>
	</div>
	</#if>
</div>
<p class="powered-by">
			<@liferay.language key="powered-by" /> <a href="http://www.liferay.com" rel="external">Liferay</a>
		</p>
	</footer>
	</#if>
</div>

${theme.include(body_bottom_include)}

${theme.include(bottom_include)}
</#if>
</body>

</html>
