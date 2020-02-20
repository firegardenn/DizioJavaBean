<html>
    <body>
        <jsp:useBean id="t" class="app.Inserisci"/>
        <jsp:setProperty name="t" property="parola" param="parola"/>
        <jsp:setProperty name="t" property="significato" param="significato"/>
        <jsp:getProperty name="t" property="risultato" /> 
    </body>
</html>
