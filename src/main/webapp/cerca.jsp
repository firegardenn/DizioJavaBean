<html>
    <body>
        <jsp:useBean id="s" class="app.Cerca"/>
        <jsp:setProperty name="s" property="risultato" param="cerca"/>
	    <jsp:getProperty name="s" property="risultato"/>
    </body>
</html>