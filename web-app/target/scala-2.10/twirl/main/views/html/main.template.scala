
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.at("stylesheets/container.min.css")),format.raw/*18.88*/("""">
        <link rel="stylesheet" href=""""),_display_(/*19.39*/routes/*19.45*/.Assets.at("stylesheets/main.min.css")),format.raw/*19.83*/("""">
        <link rel="stylesheet" href=""""),_display_(/*20.39*/routes/*20.45*/.Assets.at("stylesheets/navbar.min.css")),format.raw/*20.85*/("""">
        <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Abril+Fatface" />
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.at("images/proConnect.jpg")),format.raw/*22.100*/("""">
        </head>
    <body>
        """),_display_(/*25.10*/content),format.raw/*25.17*/("""
    """),format.raw/*26.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 07 23:34:04 PDT 2015
                  SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/main.scala.html
                  HASH: 960d47227708049c8bc2f84cfb21bbed5e740693
                  MATRIX: 727->1|845->31|873->33|950->84|975->89|1612->699|1627->705|1691->748|1759->789|1774->795|1833->833|1901->874|1916->880|1977->920|2170->1086|2185->1092|2242->1127|2308->1166|2336->1173|2368->1178
                  LINES: 26->1|29->1|31->3|35->7|35->7|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|50->22|53->25|53->25|54->26
                  -- GENERATED --
              */
          