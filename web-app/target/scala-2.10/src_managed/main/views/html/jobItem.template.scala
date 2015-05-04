
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
object jobItem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Forum,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(jobItem: Forum):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""
"""),_display_(Seq[Any](/*2.2*/main("ProConnect")/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""
"""),_display_(Seq[Any](/*3.2*/navbar/*3.8*/.render())),format.raw/*3.17*/("""


<div class="container-fluid">

		<div class="feed-div">
				"""),_display_(Seq[Any](/*9.6*/if(jobItem.topicHeader != "")/*9.35*/{_display_(Seq[Any](format.raw/*9.36*/("""
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*13.53*/jobItem/*13.60*/.topicHeader)),format.raw/*13.72*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*16.38*/jobItem/*16.45*/.body)),format.raw/*16.50*/("""</p>
					</div>
				</div>
				""")))})),format.raw/*19.6*/("""
		</div>


	
</div>
""")))})),format.raw/*25.2*/("""
"""))}
    }
    
    def render(jobItem:Forum): play.api.templates.HtmlFormat.Appendable = apply(jobItem)
    
    def f:((Forum) => play.api.templates.HtmlFormat.Appendable) = (jobItem) => apply(jobItem)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 13:18:07 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/jobItem.scala.html
                    HASH: 7bdeae101976c48652cc53b8a1204e8e0f94a3e4
                    MATRIX: 775->1|885->17|921->19|947->37|986->39|1022->41|1035->47|1065->56|1163->120|1200->149|1238->150|1409->285|1425->292|1459->304|1562->371|1578->378|1605->383|1669->416|1722->438
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|37->9|37->9|37->9|41->13|41->13|41->13|44->16|44->16|44->16|47->19|53->25
                    -- GENERATED --
                */
            