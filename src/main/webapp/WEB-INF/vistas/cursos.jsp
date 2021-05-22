<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <title>Cursos</title>
</head>
<body>
    <div class="container">
        <ul class="nav nav-pills">
            <li role="presentation"><a href="#">Home</a></li>
            <li role="presentation" class="active"><a href="#">Cursos</a></li>
        </ul>
    </div>

    <h2 style="padding-left: 4rem">Qué aprender ahora</h2>

    <h3 style="padding-left: 4rem">Los mejores cursos: </h3>
    <br>

    <div class="container">
        <div class="row" style="width: 100%">
            <c:forEach items="${CURSOS}" var="CURSO">
                <div class="col-sm-4">
                    <div class="thumbnail">
                        <img src="..." alt="...">
                        <div class="caption">
                            <h3>${CURSO.nombreCurso}</h3>
                            <p>${CURSO.nombreProfesor}</p>
                            <p>${CURSO.costo}</p>
                            <p><a href="#" class="btn btn-primary" role="button">Acceder</a></p>
                        </div>
                    </div>
                </div>
            </c:forEach>
            ${ERROR}
        </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
