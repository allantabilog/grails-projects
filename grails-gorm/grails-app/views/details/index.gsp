<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Details Page</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>

<body>
<g:render template="/templates/gtm"/>
<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>View Customer Details</h1>


        <% def now = new Date() %>
        <p>On <%=now%></p>


        <g:render template="/templates/timestamp"/>

    </section>
</div>

</body>
</html>
