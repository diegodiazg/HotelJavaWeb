package org.apache.jsp.template.cliente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../../lumino/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../../lumino/css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../../lumino/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!--Icons-->\n");
      out.write("<script src=\"../../lumino/js/lumino.glyphs.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#sidebar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><span>Hotel</span>Palmas</a>\n");
      out.write("                <ul class=\"user-menu\">\n");
      out.write("                    <li class=\"dropdown pull-right\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><svg class=\"glyph stroked male-user\"><use xlink:href=\"#stroked-male-user\"></use></svg> User <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                            <li><a href=\"#\"><svg class=\"glyph stroked male-user\"><use xlink:href=\"#stroked-male-user\"></use></svg> Perfil</a></li>\n");
      out.write("                            <li><a href=\"#\"><svg class=\"glyph stroked gear\"><use xlink:href=\"#stroked-gear\"></use></svg> Configuracion</a></li>\n");
      out.write("                            <li><a href=\"#\"><svg class=\"glyph stroked cancel\"><use xlink:href=\"#stroked-cancel\"></use></svg> Salir</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("        </div><!-- /.container-fluid -->\n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("    <div id=\"sidebar-collapse\" class=\"col-sm-3 col-lg-2 sidebar\">\n");
      out.write("        <form role=\"search\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Buscar\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <ul class=\"nav menu\">\n");
      out.write("            <li class=\"active\"><a href=\"index.html\"><svg class=\"glyph stroked dashboard-dial\"><use xlink:href=\"#stroked-dashboard-dial\"></use></svg> Dashboard</a></li>\n");
      out.write("            <li><a href=\"widgets.html\"><svg class=\"glyph stroked calendar\"><use xlink:href=\"#stroked-calendar\"></use></svg> Clientes</a></li>\n");
      out.write("            <li><a href=\"charts.html\"><svg class=\"glyph stroked line-graph\"><use xlink:href=\"#stroked-line-graph\"></use></svg> Reservaciones</a></li>\n");
      out.write("            <li><a href=\"tables.html\"><svg class=\"glyph stroked table\"><use xlink:href=\"#stroked-table\"></use></svg> Hotel</a></li>\n");
      out.write("            <li><a href=\"forms.html\"><svg class=\"glyph stroked pencil\"><use xlink:href=\"#stroked-pencil\"></use></svg> Usuarios</a></li>\n");
      out.write("            <li><a href=\"panels.html\"><svg class=\"glyph stroked app-window\"><use xlink:href=\"#stroked-app-window\"></use></svg> Habitaciones</a></li>\n");
      out.write("       \n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div><!--/.sidebar-->\n");
      out.write("        \n");
      out.write("    <div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\">           \n");
      out.write("        <div class=\"row\">\n");
      out.write("        \n");
      out.write("        </div><!--/.row-->\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("    \n");
      out.write("        </div><!--/.row-->\n");
      out.write("                                \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("            \n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("        </div><!--/.col-->\n");
      out.write("            \n");
      out.write("         <div class=\"col-md-4\">\n");
      out.write("            \n");
      out.write("          \n");
      out.write("                                \n");
      out.write("        </div><!--/.col-->\n");
      out.write("    </div>  <!--/.main-->\n");
      out.write("\n");
      out.write("    <script src=\"../../lumino/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <script src=\"../../lumino/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../../lumino/js/chart.min.js\"></script>\n");
      out.write("    <script src=\"../../lumino/js/chart-data.js\"></script>\n");
      out.write("    <script src=\"../../lumino/js/easypiechart.js\"></script>\n");
      out.write("    <script src=\"../../lumino/js/easypiechart-data.js\"></script>\n");
      out.write("    <script src=\"../../lumino/js/bootstrap-datepicker.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $('#calendar').datepicker({\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        !function ($) {\n");
      out.write("            $(document).on(\"click\",\"ul.nav li.parent > a > span.icon\", function(){          \n");
      out.write("                $(this).find('em:first').toggleClass(\"glyphicon-minus\");      \n");
      out.write("            }); \n");
      out.write("            $(\".sidebar span.icon\").find('em:first').addClass(\"glyphicon-plus\");\n");
      out.write("        }(window.jQuery);\n");
      out.write("\n");
      out.write("        $(window).on('resize', function () {\n");
      out.write("          if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')\n");
      out.write("        })\n");
      out.write("        $(window).on('resize', function () {\n");
      out.write("          if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')\n");
      out.write("        })\n");
      out.write("    </script>   \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
