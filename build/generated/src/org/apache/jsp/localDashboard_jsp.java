package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class localDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("\t<html class=\"no-js\" lang=\"\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<title>CeylonWanderer|Local</title>\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/normalize.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/icomoon.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/transitions.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/flags.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/owl.carousel.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/prettyPhoto.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/jquery-ui.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/scrollbar.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/chartist.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/main.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/dashboard.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/color.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/responsive.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"members/css/dbresponsive.css\">\n");
      out.write("\t<script src=\"members/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div id=\"tg-wrapper\" class=\"tg-wrapper tg-haslayout\">\n");
      out.write("\t\t<!--************************************\n");
      out.write("\t\t\t\tHeader Start\n");
      out.write("\t\t*************************************-->\n");
      out.write("\t\t<header id=\"tg-dashboardheader\" class=\"tg-dashboardheader tg-haslayout\">\n");
      out.write("\t\t\t<nav id=\"tg-nav\" class=\"tg-nav\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#tg-navigation\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"tg-navigation\" class=\"collapse navbar-collapse tg-navigation\">\n");
      out.write("                                    <image src=\"members/logo.jpg\"> 𝕮𝖊𝖞𝖑𝖔𝖓𝖂𝖆𝖓𝖉𝖊𝖗𝖊𝖗© \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<div class=\"tg-rghtbox\">\n");
      out.write("\t\t\t\t<a class=\"tg-btn\" href=\"localPostAd.jsp\">\n");
      out.write("\t\t\t\t\t<i class=\"icon-bookmark\"></i>\n");
      out.write("\t\t\t\t\t<span>post an ad</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"tg-sidebarwrapper\" class=\"tg-sidebarwrapper\">\n");
      out.write("\t\t\t\t<span id=\"tg-btnmenutoggle\" class=\"tg-btnmenutoggle\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"67\" viewBox=\"0 0 20 67\">\n");
      out.write("\t\t\t\t\t\t<metadata>\n");
      out.write("\t\t\t\t\t\t\t<?xpacket begin=\"ï»¿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n");
      out.write("\t\t\t\t\t\t\t\t<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 5.6-c138 79.159824, 2016/09/14-01:09:01\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<rdf:Description rdf:about=\"\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t</rdf:RDF>\n");
      out.write("\t\t\t\t\t\t\t\t</x:xmpmeta>\n");
      out.write("\t\t\t\t\t\t\t<?xpacket end=\"w\"?>\n");
      out.write("\t\t\t\t\t\t</metadata>\n");
      out.write("\t\t\t\t\t\t<path id=\"bg\" class=\"cls-1\" d=\"M20,27.652V39.4C20,52.007,0,54.728,0,67.265,0,106.515.026-39.528,0-.216-0.008,12.32,20,15.042,20,27.652Z\"/>\n");
      out.write("\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t<div id=\"tg-verticalscrollbar\" class=\"tg-verticalscrollbar\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"tg-user\">\n");
      out.write("\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tg-bolticon\"><i class=\"fa fa-bolt\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:void(0);\"><img src=\"members/images/author/img-07.jpg\" alt=\"image description\"></a>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-usercontent\">\n");
      out.write("\t\t\t\t\t\t\t<h3> Welcome! </h3>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<nav id=\"tg-navdashboard\" class=\"tg-navdashboard\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"localSettings.jsp\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-cog\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Profile Settings</span>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.jsp\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-exit\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Logout</span>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t<!--************************************\n");
      out.write("\t\t\t\tHeader End\n");
      out.write("\t\t*************************************-->\n");
      out.write("\t\t<!--************************************\n");
      out.write("\t\t\t\tDashboard Banner Start\n");
      out.write("\t\t*************************************-->\n");
      out.write("\t\t<div class=\"tg-dashboardbanner\">\n");
      out.write("\t\t\t<h1>Dashboard</h1>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--************************************\n");
      out.write("\t\t\t\tDashboard Banner End\n");
      out.write("\t\t*************************************-->\n");
      out.write("\t\t<!--************************************\n");
      out.write("\t\t\t\tMain Start\n");
      out.write("\t\t*************************************-->\n");
      out.write("\t\t<main id=\"tg-main\" class=\"tg-main tg-haslayout\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\tStatistics Start\n");
      out.write("\t\t\t*************************************-->\n");
      out.write("\t\t\t<section class=\"tg-dbsectionspace tg-haslayout tg-statistics\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-dashboardbox tg-statistic\">\n");
      out.write("\t\t\t\t\t\t\t<figure><img src=\"members/images/icons/img-32.png\" alt=\"image description\"></figure>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-contentbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>0</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Total Ad Posted</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-dashboardbox tg-statistic\">\n");
      out.write("\t\t\t\t\t\t\t<figure><img src=\"members/images/icons/img-33.png\" alt=\"image description\"></figure>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-contentbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>0</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Featured Ads</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-dashboardbox tg-statistic\">\n");
      out.write("\t\t\t\t\t\t\t<figure><img src=\"members/images/icons/img-34.png\" alt=\"image description\"></figure>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-contentbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>0</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Inactive Ads</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-dashboardbox tg-statistic\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tg-badge\">0</span>\n");
      out.write("\t\t\t\t\t\t\t<figure><img src=\"members/images/icons/img-35.png\" alt=\"image description\"></figure>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-contentbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>0</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Offer/Messages</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\tStatistics End\n");
      out.write("\t\t\t*************************************-->\n");
      out.write("\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\tSection Start\n");
      out.write("\t\t\t*************************************-->\n");
      out.write("\t\t\t<section class=\"tg-dbsectionspace tg-haslayout\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tActivity Start\n");
      out.write("\t\t\t\t\t*************************************-->\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4 tg-lgcolwidthhalf\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-dashboardbox\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-dashboardboxtitle\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>My Ads</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-dashboardholder tg-myactivitylog tg-verticalscrollbar tg-dashboardscrollbar\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"tg-activitylog\">\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>You Logged In Via Mobile</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<time datetime=\"2017-08-08\">02 Minutes Ago</time>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li> -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tActivity End\n");
      out.write("\t\t\t\t\t*************************************-->\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tApproved Ads Start\n");
      out.write("\t\t\t\t\t*************************************-->\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4 tg-lgcolwidthhalf\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-dashboardbox\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-dashboardboxtitle\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Recent Approved Ads</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-dashboardholder tg-approvedads tg-verticalscrollbar tg-dashboardscrollbar\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"tg-approvedads\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<figure><a href=\"javascript:void(0);\"><img src=\"images/ads/thumbnail/img-01.jpg\" alt=\"image description\"></a></figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-adcontent\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"tg-adverified\">Verified Ad</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Brand new lenovo laptop i5 for sale</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<time datetime=\"2017-08-08\">01 Day Ago</time>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li> -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tApproved Ads End\n");
      out.write("\t\t\t\t\t*************************************-->\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tTotal Views Start\n");
      out.write("\t\t\t\t\t*************************************-->\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4 tg-lgcolwidthhalf\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-dashboardbox\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-dashboardboxtitle\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Total Views</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"tg-formtheme tg-formthemesearch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"tg-select\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option> </option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-dashboardholder tg-totalviews\">\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"tg-viewchart\" class=\"tg-viewchart\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tTotal Views End\n");
      out.write("\t\t\t\t\t*************************************-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\tSection End\n");
      out.write("\t\t\t*************************************-->\n");
      out.write("\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\tSection Start\n");
      out.write("\t\t\t*************************************-->\n");
      out.write("\t\t\t<section class=\"tg-dbsectionspace tg-haslayout\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tOffers/Messages Start\n");
      out.write("\t\t\t\t\t*************************************-->\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-8 col-md-8 col-lg-8 tg-lgcolwidthfull\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-dashboardbox\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-dashboardboxtitle\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Offers/Messages</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-dashboardholder tg-offersmessages\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t   <div class=\"tg-verticalscrollbar tg-dashboardscrollbar\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!--<div class=\"tg-ad tg-dotnotification\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<figure><img src=\"images/ads/thumbnail/img-01.jpg\" alt=\"image description\"></figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3>Brand new lenovo laptop i5 for sale</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div> -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-offerers tg-verticalscrollbar tg-dashboardscrollbar\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!--<div class=\"tg-offerer tg-dotnotification\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<figure><img src=\"images/author/img-08.jpg\" alt=\"image description\"></figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3>Antoine Hibdon</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-chatarea\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"tg-messages tg-verticalscrollbar tg-dashboardscrollbar\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!--<div class=\"tg-offerermessage\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<figure><img src=\"images/author/img-16.jpg\" alt=\"image description\"></figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tg-description\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Consectetur adipisicing elit sei do eiusmod tempor incididunt labore et dolore.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<time datetime=\"2017-08-08\">January 12th, 2011</time>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tg-memessage tg-readmessage\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<figure><img src=\"images/author/img-17.jpg\" alt=\"image description\"></figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tg-description\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Eiusmod tempor incididunt labore et dolore magna aliqiu enim ad minim veniam qiuisru exercitation ullamco laborisen nisi ut aliquip exea.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"https://themeforest.net/\" target=\"_blank\">https://themeforest.net</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>It that ok?</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<time datetime=\"2017-08-08\">Jun 28, 2017 09:30</time>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div> -->\n");
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"tg-replaybox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<textarea class=\"form-control\" name=\"reply\" placeholder=\"Type Here &amp; Press Enter\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tg-iconbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-thumbs-up\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-thumbs-down\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-smile\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tOffers/Messages End\n");
      out.write("\t\t\t\t\t*************************************\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tTodo Task List Start\n");
      out.write("\t\t\t\t\t*************************************\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4 col-lg-4 tg-lgcolwidthfull\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tg-dashboardbox\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-dashboardboxtitle\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Todo Task List</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tg-verticalscrollbar tg-dashboardscrollbar tg-todotasklist\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todoone\" type=\"checkbox\" name=\"todolist\" value=\"one\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todoone\">Consectetur adipisicing elit sed do eiusmod lokatns eima tempor incididunt ut labore</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todotwo\" type=\"checkbox\" name=\"todolist\" value=\"two\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todotwo\">Ut enim ad minim veniam quis nostrud sheisam</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todothree\" type=\"checkbox\" name=\"todolist\" value=\"three\" checked>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todothree\">Exercitation ullamco laboris lokamna</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todofour\" type=\"checkbox\" name=\"todolist\" value=\"four\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todofour\">Aisi ut aliquip ex ea commodo consequat</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todofive\" type=\"checkbox\" name=\"todolist\" value=\"five\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todofive\">Duis aute irure dolor sola to hokama</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todosix\" type=\"checkbox\" name=\"todolist\" value=\"six\" checked>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todosix\">Reprehenderit in voluptate velit esse cillum</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todoseven\" type=\"checkbox\" name=\"todolist\" value=\"seven\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todoseven\">Excepteur sint occaecat lokstanshie</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todoeight\" type=\"checkbox\" name=\"todolist\" value=\"eight\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todoeight\">Cupidatat non proident sunt in culpa milake na shiet</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todonine\" type=\"checkbox\" name=\"todolist\" value=\"nine\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todonine\">Consectetur adipisicing elit sed do eiusmod lokatns eima tempor incididunt ut labore</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todoten\" type=\"checkbox\" name=\"todolist\" value=\"ten\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todoten\">Ut enim ad minim veniam quis nostrud sheisam</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todoeleven\" type=\"checkbox\" name=\"todolist\" value=\"eleven\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todoeleven\">Exercitation ullamco laboris lokamna</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todotwelve\" type=\"checkbox\" name=\"todolist\" value=\"twelve\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todotwelve\">Aisi ut aliquip ex ea commodo consequat</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todothirteen\" type=\"checkbox\" name=\"todolist\" value=\"thirteen\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todothirteen\">Duis aute irure dolor sola to hokama</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todofourteen\" type=\"checkbox\" name=\"todolist\" value=\"fourteen\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todofourteen\">Reprehenderit in voluptate velit esse cillum</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todofifteen\" type=\"checkbox\" name=\"todolist\" value=\"fifteen\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todofifteen\">Excepteur sint occaecat lokstanshie</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tg-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"tg-todosixteen\" type=\"checkbox\" name=\"todolist\" value=\"sixteen\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"tg-todosixteen\">Cupidatat non proident sunt in culpa milake na shiet</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\t\t\tTodo Task List End\n");
      out.write("\t\t\t\t\t*************************************-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!--************************************\n");
      out.write("\t\t\t\t\tSection End\n");
      out.write("\t\t\t*************************************-->\n");
      out.write("\t\t</main>\n");
      out.write("\t\t<!--************************************\n");
      out.write("\t\t\t\tMain End\n");
      out.write("\t\t*************************************-->\n");
      out.write("\t\t<!--************************************\n");
      out.write("\t\t\t\tFooter Start\n");
      out.write("\t\t*************************************-->\n");
      out.write("\t\t<footer id=\"tg-footer\" class=\"tg-footer tg-haslayout\">\n");
      out.write("\t\t\t<nav class=\"tg-footernav\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:void(0);\">Listing Policy</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:void(0);\">Terms of Use</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:void(0);\">Privacy Policy</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<span class=\"tg-copyright\"> CeylonWanderer &copy; </span>\n");
      out.write("\t\t</footer>\n");
      out.write("\t\t<!--************************************\n");
      out.write("\t\t\t\tFooter End\n");
      out.write("\t\t*************************************-->\n");
      out.write("\t</div>\n");
      out.write("\t<!--************************************\n");
      out.write("\t\t\tWrapper End\n");
      out.write("\t*************************************-->\n");
      out.write("\t<script src=\"members/js/vendor/jquery-library.js\"></script>\n");
      out.write("\t<script src=\"members/js/vendor/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"http://maps.google.com/maps/api/js?key=AIzaSyCR-KEWAVCn52mSdeVeTqZjtqbmVJyfSus&amp;language=en\"></script>\n");
      out.write("\t<script src=\"members/js/tinymce/tinymce.min4bb5.js?apiKey=4cuu2crphif3fuls3yb1pe4qrun9pkq99vltezv2lv6sogci\"></script>\n");
      out.write("\t<script src=\"members/JS/responsivethumbnailgallery.html\"></script>\n");
      out.write("\t<script src=\"members/js/jquery.flagstrap.min.js\"></script>\n");
      out.write("\t<script src=\"members/js/backgroundstretch.js\"></script>\n");
      out.write("\t<script src=\"members/js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"members/js/jquery.vide.min.js\"></script>\n");
      out.write("\t<script src=\"members/js/jquery.collapse.js\"></script>\n");
      out.write("\t<script src=\"members/js/scrollbar.min.js\"></script>\n");
      out.write("\t<script src=\"members/JS/chartist.min.html\"></script>\n");
      out.write("\t<script src=\"members/js/prettyPhoto.js\"></script>\n");
      out.write("\t<script src=\"members/js/jquery-ui.js\"></script>\n");
      out.write("\t<script src=\"members/js/countTo.js\"></script>\n");
      out.write("\t<script src=\"members/js/appear.js\"></script>\n");
      out.write("\t<script src=\"members/js/gmap3.js\"></script>\n");
      out.write("\t<script src=\"members/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
