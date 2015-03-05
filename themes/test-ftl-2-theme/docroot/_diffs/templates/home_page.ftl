<div class="container-fluid" id="wrapper">
	<header id="banner-home" role="banner">
		<div id="heading-home">
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
		<#if has_navigation || is_signed_in>
			<#if show_navigation = true>
			<#include "${full_templates_path}/navigation.ftl" />
			</#if>
		</#if>
	</header>
	<div id="HomeImage">
	<div>
		${theme.runtime("56")}
	</div>
	</div>
	<div id="content">
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
</div>

${theme.include(body_bottom_include)}

${theme.include(bottom_include)}