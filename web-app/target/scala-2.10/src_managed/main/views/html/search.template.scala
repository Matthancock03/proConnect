
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*3.2*/main("ProConnect")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
 """),_display_(Seq[Any](/*4.3*/navbar/*4.9*/.render)),format.raw/*4.16*/("""



<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">

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
					Compnaies
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
""")))})),format.raw/*54.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 01 20:26:11 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/search.scala.html
                    HASH: bff5559246d59439a724c49cbfee133cf614f74d
                    MATRIX: 865->3|891->21|930->23|967->26|980->32|1008->39|1795->795
                    LINES: 29->3|29->3|29->3|30->4|30->4|30->4|80->54
                    -- GENERATED --
                */
            