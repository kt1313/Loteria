<%@ page import="pl.javastart.loteria.LoteriaResults" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wynik losowania</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<main>
    <% LoteriaResults result = (LoteriaResults) request.getAttribute("lotteryResult"); %>
<h3>Wynik losowania: <%=result.getLotteryNumbers()%></h3>
<h3>Twoje liczby: <%=result.getUserNumbers()%></h3>
<h3>Liczby trafione: (<%=result.getMatchedNumbers().size()%>), <%=result.getMatchedNumbers()%></h3>
</main>
</body>
</html>
