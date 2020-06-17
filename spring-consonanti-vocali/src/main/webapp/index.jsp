<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input type="text" name="testo" placeholder="Inserisci il testo">
<form action="parole" method="post">
<input type="hidden" name="testo">
		<input type="submit" value="Parole">
	</form>
	<form action="consonanti" method="post">
<input type="hidden" name="testo">
		<input type="submit" value="Consonanti">
	</form>
	<form action="vocali" method="post">
<input type="hidden" name="testo">
		<input type="submit" value="Vocali">
	</form>
</body>
</html>