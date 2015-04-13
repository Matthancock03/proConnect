
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href=""""),_display_(Seq[Any](/*18.39*/routes/*18.45*/.Assets.at("stylesheets/container.min.css"))),format.raw/*18.88*/("""">
        <link rel="stylesheet" href=""""),_display_(Seq[Any](/*19.39*/routes/*19.45*/.Assets.at("stylesheets/main.min.css"))),format.raw/*19.83*/("""">
        <link rel="stylesheet" href=""""),_display_(Seq[Any](/*20.39*/routes/*20.45*/.Assets.at("stylesheets/navbar.min.css"))),format.raw/*20.85*/("""">
        <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Abril+Fatface" />
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*22.59*/routes/*22.65*/.Assets.at("images/proConnect.jpg"))),format.raw/*22.100*/("""">
        </head>
    <body>
        """),_display_(Seq[Any](/*25.10*/content)),format.raw/*25.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Sun Apr 12 09:48:01 PDT 2015
                    SOURCE: C:/Users/Roya/Desktop/proConnect/web-app/app/views/main.scala.html
                    HASH: c3ce70eb092990d26f1cdfcbec6e0865efe49473
                    MATRIX: 778->1|902->31|996->90|1022->95|1679->716|1694->722|1759->765|1837->807|1852->813|1912->851|1990->893|2005->899|2067->939|2271->1107|2286->1113|2344->1148|2422->1190|2451->1197
=======
                    DATE: Mon Apr 13 12:13:30 PDT 2015
                    SOURCE: /home/beyondprosthetics/repos/school/proConnect/web-app/app/views/main.scala.html
                    HASH: 73a1f599712f7e59b8a2009bedf61b1851af0ea6
                    MATRIX: 778->1|902->31|990->84|1016->89|1662->699|1677->705|1742->748|1819->789|1834->795|1894->833|1971->874|1986->880|2048->920|2250->1086|2265->1092|2323->1127|2398->1166|2427->1173
>>>>>>> e982e8c79cee97b72b05ee7de778fce31714ddfa
                    LINES: 26->1|29->1|35->7|35->7|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|50->22|53->25|53->25
                    -- GENERATED --
                */
            