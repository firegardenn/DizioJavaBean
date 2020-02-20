<html>
    <body>
        <jsp:useBean id="x" class="app.Delete"/>
        <jsp:setProperty name="x" property="parola" param="delete"/>
        <jsp:getProperty name="x" property="risultato" />
        </body>
</html>
