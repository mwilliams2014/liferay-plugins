<#--
This file allows you to override and define new FreeMarker variables.
-->
<#assign liferay_toggle_controls = "visible">

<#if liferay_toggle_controls = "visible">
<#assign css_class = css_class + "controls-visible" />
<#else>
<#assign css_class = css_class + "controls-hidden" />
</#if>

<#assign footer_nav_friendly_url = "/footer-navigation"/>

<#assign show_breadcrumbs = getterUtil.getBoolean(theme_settings["show-breadcrumbs"]!"", true) />

<#assign show_social_media = getterUtil.getBoolean(theme_settings["show-social-media"]!"", true) />

<#assign show_navigation = getterUtil.getBoolean(theme_settings["show-navigation"]!"", true) />

<#assign show_page_title = getterUtil.getBoolean(theme_settings["show-page-title"]!"", true) />

<#assign show_footer = getterUtil.getBoolean(theme_settings["show-footer"]!"", true) />

<#assign show_heading = getterUtil.getBoolean(theme_settings["show-heading"]!"", true) />


<#if show_breadcrumbs = true>
	<#assign show_breadcrumbs = true />
</#if>

<#if show_social_media = true>
	<#assign show_social_media = true />
</#if>

<#if show_navigation = true>
	<#assign show_navigation = true />
</#if>

<#if show_page_title = true>
	<#assign show_page_title = true />
</#if>

<#if show_footer = true>
	<#assign show_footer = true />
</#if>

<#if show_heading = true>
	<#assign show_heading = true />
</#if>

