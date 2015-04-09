
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/"></a>
            </div>
        </div>
    </div>
    <div id="content" class="container">

    </div>
    <script type="text/template" id="message_content">
        <div class="well">
            <h1><%- value %></h1>
        </div>

        <button id="getMessageButton">Get JSON Message</button>
    </script>
    <script type="text/javascript" src=""""),_display_(/*24.42*/routes/*24.48*/.Assets.at("bower_components/jquery/jquery.js")),format.raw/*24.95*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*25.42*/routes/*25.48*/.Assets.at("bower_components/underscore/underscore.js")),format.raw/*25.103*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*26.42*/routes/*26.48*/.Assets.at("bower_components/backbone/backbone.js")),format.raw/*26.99*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*27.42*/routes/*27.48*/.Assets.at("javascript/index.js")),format.raw/*27.81*/(""""></script>
</body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 07 23:34:04 PDT 2015
                  SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/index.scala.html
                  HASH: 683a0d7c1b985e368972052c108f888c1079d273
                  MATRIX: 798->0|1420->595|1435->601|1503->648|1583->701|1598->707|1675->762|1755->815|1770->821|1842->872|1922->925|1937->931|1991->964
                  LINES: 29->1|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27
                  -- GENERATED --
              */
          