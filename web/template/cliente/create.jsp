<%-- 
    Document   : create
    Created on : Oct 19, 2016, 2:21:51 AM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../../lumino/css/bootstrap.min.css" rel="stylesheet">
        <link href="../../lumino/css/datepicker3.css" rel="stylesheet">
        <link href="../../lumino/css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="../../lumino/js/lumino.glyphs.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><span>Hotel</span>Palmas</a>
                <ul class="user-menu">
                    <li class="dropdown pull-right">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> User <span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Perfil</a></li>
                            <li><a href="#"><svg class="glyph stroked gear"><use xlink:href="#stroked-gear"></use></svg> Configuracion</a></li>
                            <li><a href="#"><svg class="glyph stroked cancel"><use xlink:href="#stroked-cancel"></use></svg> Salir</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
                            
        </div><!-- /.container-fluid -->
    </nav>
        
    <div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
        <form role="search">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Buscar">
            </div>
        </form>
        <ul class="nav menu">
            <li class="active">
                <a href="template/cliente/create.jsp">
                    <svg class="glyph stroked dashboard-dial">
                        <use xlink:href="#stroked-dashboard-dial">
                        </use>
                    </svg> 
                    Dashboard
                </a>
            </li>
            <li><a href="widgets.html"><svg class="glyph stroked calendar"><use xlink:href="#stroked-calendar"></use></svg> Clientes</a></li>
            <li><a href="charts.html"><svg class="glyph stroked line-graph"><use xlink:href="#stroked-line-graph"></use></svg> Reservaciones</a></li>
            <li><a href="tables.html"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg> Hotel</a></li>
            <li><a href="forms.html"><svg class="glyph stroked pencil"><use xlink:href="#stroked-pencil"></use></svg> Usuarios</a></li>
            <li><a href="panels.html"><svg class="glyph stroked app-window"><use xlink:href="#stroked-app-window"></use></svg> Habitaciones</a></li>
       
        </ul>

    </div><!--/.sidebar-->
        
    <div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">           
        <div class="row">
                                                <div class="row">
            <ol class="breadcrumb">
                <li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
                <li class="active">Cliente</li>
            </ol>
        </div><!--/.row-->
        
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Nuevo Cliente</h1>
            </div>
        </div><!--/.row-->
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form role="form" name="form" method="post" action="/webapp/ServletCliente">
                        <div class="col-md-6">
                            
                            
                                <div class="form-group">
                                    <label>Nombre</label>
                                    <input name="nombre" type="text" class="form-control">
                                </div>
                                                                
                                <div class="form-group">
                                    <label>Apellido</label>
                                    <input name="apellido" type="text" class="form-control">
                                </div>
                                  <div class="form-group">
                                    <label>NIT</label>
                                    <input name="nit" type="text" class="form-control">
                                </div>
                                  <div class="form-group">
                                    <label>Telefono</label>
                                    <input name="tel" type="phone" class="form-control">
                                </div>
                          
                            </div>
                            <div class="col-md-6">

                                
                                <div class="form-group">
                                    <label>Direccion</label>
                                    <textarea name="dir" class="form-control" rows="3"></textarea>
                                </div>
                                
                                <button type="submit" class="btn btn-primary">Guardar</button>
                                <button type="reset" class="btn btn-default">Limpiar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div><!-- /.col-->
            </div><!-- /.row -->
        </div><!--/.row-->
        
        <div class="row">
    
        </div><!--/.row-->
                                
        <div class="row">
            <div class="col-md-8">
            
    
            </div>
                
        </div><!--/.col-->
            
         <div class="col-md-4">
            
          
                                
        </div><!--/.col-->
    </div>  <!--/.main-->

    <script src="../../lumino/js/jquery-1.11.1.min.js"></script>
    <script src="../../lumino/js/bootstrap.min.js"></script>
    <script src="../../lumino/js/bootstrap-datepicker.js"></script>
    <script>
        $('#calendar').datepicker({
        });

        !function ($) {
            $(document).on("click","ul.nav li.parent > a > span.icon", function(){          
                $(this).find('em:first').toggleClass("glyphicon-minus");      
            }); 
            $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
        }(window.jQuery);

        $(window).on('resize', function () {
          if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
        })
        $(window).on('resize', function () {
          if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
        })
    </script>   
</body>
</html>

