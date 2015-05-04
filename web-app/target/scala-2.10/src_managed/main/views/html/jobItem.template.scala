
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
                    DATE: Sun May 03 23:47:26 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/jobItem.scala.html
                    HASH: 6c94de5939e17297fc61276da7695ddbfcb83787
                    MATRIX: 775->1|885->17|922->20|948->38|987->40|1024->43|1037->49|1067->58|1171->128|1208->157|1246->158|1421->297|1437->304|1471->316|1577->386|1593->393|1620->398|1687->434|1746->462
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|37->9|37->9|37->9|41->13|41->13|41->13|44->16|44->16|44->16|47->19|53->25
                    -- GENERATED --
                */
            