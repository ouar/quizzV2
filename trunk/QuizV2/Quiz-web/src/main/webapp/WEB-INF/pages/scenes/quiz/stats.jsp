<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script	src='<c:url value="/resources/js/libs/highcharts/highcharts.js" />'></script>


<script type="text/javascript">

tabLibelle = new Array();
tabNbPointsGagnes = new Array();
tabNbPointsPerdus = new Array();

tabLibelle.push('<b>Quiz</b>');
tabNbPointsGagnes.push(${stats.nbPointsObtenus});
tabNbPointsPerdus.push(${stats.nbPointsDispos - stats.nbPointsObtenus});

<c:forEach var="langage" items="${stats.lStatsLangages}">
tabLibelle.push('<i><c:out value="${langage.langage.libelle}"/></i>');
tabNbPointsGagnes.push(${langage.nbPointsObtenus});
tabNbPointsPerdus.push(${langage.nbPointsDispos - langage.nbPointsObtenus});
</c:forEach>
<c:forEach var="langage" items="${stats.lStatsLangages}">
<c:forEach var="sujet" items="${langage.mSujets}">
tabLibelle.push('<i><c:out value="${langage.langage.libelle}"/></i><br/><c:out value="${sujet.value.sujet.libelle}"/><br/>(<c:out value="${sujet.value.difficulte.libelle}"/>)');
tabNbPointsGagnes.push(${sujet.value.nbPointsObtenus});
tabNbPointsPerdus.push(${sujet.value.nbPointsDispos - sujet.value.nbPointsObtenus});
</c:forEach>
</c:forEach>





$(function () {
    $('#chartContainer').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'R�sultat du quiz de <c:out value="${stats.candidat.prenom}"/> <c:out value="${stats.candidat.nom}"/>'
        },
        xAxis: {
            categories: tabLibelle
        },
        yAxis: {
        	min: 0,
            title: {
                text: 'Pourcentage'
            }
        },
        tooltip: {
            pointFormat: '<span style="color:{series.color}">{series.name}</span>: <b>{point.percentage:.1f}%</b> ({point.y:,.0f} points)<br/>',
            shared: true
        },
        plotOptions: {
            column: {
                stacking: 'percent'
            }
        },
        series: [{
        	name: 'Points perdus',
            color: "#DD0000",
            data: tabNbPointsPerdus
        },{
        	name: 'Points gagn�s',
            color: "#009000",
            data: tabNbPointsGagnes
        }]
    });
});


</script>
<div class="row">
	<div class="col-md-8 col-md-offset-2" id="chartContainer"></div>
	</div>
<!-- 	<div style="width: 300px; height: 300px; position: relative;" id="orgChart"></div>
	<div style="width: 300px; height: 300px; position: relative;" id="barChart"></div> -->