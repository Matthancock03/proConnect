
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
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
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*24.42*/routes/*24.48*/.Assets.at("bower_components/jquery/jquery.js"))),format.raw/*24.95*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*25.42*/routes/*25.48*/.Assets.at("bower_components/underscore/underscore.js"))),format.raw/*25.103*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*26.42*/routes/*26.48*/.Assets.at("bower_components/backbone/backbone.js"))),format.raw/*26.99*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*27.42*/routes/*27.48*/.Assets.at("javascript/index.js"))),format.raw/*27.81*/(""""></script>
</body>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 16 12:20:46 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/index.scala.html
                    HASH: 7a0e2e59a07c347656137bc3e5369973055ae701
                    MATRIX: 855->0|1486->595|1501->601|1570->648|1659->701|1674->707|1752->762|1841->815|1856->821|1929->872|2018->925|2033->931|2088->964
                    LINES: 29->1|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27
                    -- GENERATED --
                */
            