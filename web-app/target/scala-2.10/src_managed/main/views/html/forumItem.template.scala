
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
object forumItem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Forum,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forumItem: Forum):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""
"""),_display_(Seq[Any](/*2.2*/main("ProConnect")/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""
"""),_display_(Seq[Any](/*3.2*/navbar/*3.8*/.render())),format.raw/*3.17*/("""


<div class="container-fluid">

		<div class="feed-div">
				"""),_display_(Seq[Any](/*9.6*/if(forumItem.topicHeader != "")/*9.37*/{_display_(Seq[Any](format.raw/*9.38*/("""
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*13.53*/forumItem/*13.62*/.topicHeader)),format.raw/*13.74*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*16.38*/forumItem/*16.47*/.body)),format.raw/*16.52*/("""</p>
					</div>
				</div>
				""")))})),format.raw/*19.6*/("""
		</div>


	<div class="row clearfix">
		<div class="col-md-12 column">
			<form role="form">
				<div class="form-group">
					 <label for="exampleInputComment">Comment Section</label><input class="form-control" id="exampleInputEmail1" type="email" />
				</div>

				</div> <button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</div>
""")))})),format.raw/*35.2*/("""
"""))}
    }
    
    def render(forumItem:Forum): play.api.templates.HtmlFormat.Appendable = apply(forumItem)
    
    def f:((Forum) => play.api.templates.HtmlFormat.Appendable) = (forumItem) => apply(forumItem)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 03 18:22:02 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/forumItem.scala.html
                    HASH: 6fa72ac9e37c070b13edcb2b56d6c3fa4437d9cf
                    MATRIX: 777->1|889->19|925->21|951->39|990->41|1026->43|1039->49|1069->58|1167->122|1206->153|1244->154|1415->289|1433->298|1467->310|1570->377|1588->386|1615->391|1679->424|2085->799
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|37->9|37->9|37->9|41->13|41->13|41->13|44->16|44->16|44->16|47->19|63->35
                    -- GENERATED --
                */
            