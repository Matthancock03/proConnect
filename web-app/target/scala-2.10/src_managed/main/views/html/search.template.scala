
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(query: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),_display_(Seq[Any](/*3.2*/main("ProConnect")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
 """),_display_(Seq[Any](/*4.3*/navbar/*4.9*/.render)),format.raw/*4.16*/("""




  <h1>Connections Coming Soon!</h1>




<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
      <h1>You searched for: """),_display_(Seq[Any](/*17.30*/query)),format.raw/*17.35*/("""</h1>
			<h3>
				Advanced People Search
			</h3>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">
						Relationship
					</h3>
				</div>
				<div class="panel-body">
					Companies
				</div>
				<div class="panel-footer">
					Location
				</div>
			</div>
			<ul class="pagination">
				<li>
					<a href="#">Prev</a>
				</li>
				<li>
					<a href="#">1</a>
				</li>
				<li>
					<a href="#">2</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">4</a>
				</li>
				<li>
					<a href="#">5</a>
				</li>
				<li>
					<a href="#">Next</a>
				</li>
			</ul>
		</div>
	</div>
</div>
""")))})),format.raw/*60.2*/("""
"""))}
    }
    
    def render(query:String): play.api.templates.HtmlFormat.Appendable = apply(query)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (query) => apply(query)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 14 10:24:33 MST 2015
                    SOURCE: C:/Users/Eya/Documents/GitHub/proConnect/web-app/app/views/search.scala.html
                    HASH: a2719fe8003ff114455fa621d60617ec4f64b749
                    MATRIX: 775->1|884->16|923->21|949->39|988->41|1026->45|1039->51|1067->58|1275->230|1302->235|2048->950
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|45->17|45->17|88->60
                    -- GENERATED --
                */
            