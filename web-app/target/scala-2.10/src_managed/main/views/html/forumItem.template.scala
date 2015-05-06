
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
	<div class="row clearfix">
	<div class="col-xs-3">

	</div>
	<div class="col-xs-6" style="margin-top: 20px;">
	<img src=""""),_display_(Seq[Any](/*12.13*/forumItem/*12.22*/.imageUrl)),format.raw/*12.31*/(""""/>
		<div class="feed-div" style="margin-top: 20px;">
				"""),_display_(Seq[Any](/*14.6*/if(forumItem.topicHeader != "")/*14.37*/{_display_(Seq[Any](format.raw/*14.38*/("""
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*18.53*/forumItem/*18.62*/.topicHeader)),format.raw/*18.74*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*21.38*/forumItem/*21.47*/.body)),format.raw/*21.52*/("""</p>
					</div>
				</div>
				""")))})),format.raw/*24.6*/("""
		</div>

				<form role="form">
					<div class="form-group" style="margin-top: 15px;">
						 <label for="exampleInputComment">Comment Section</label><input class="form-control" id="commentSubmission" type="text" />
			 		<a href="#" ><button class="btn btn-default">Comment</button></a>
						</div>
					</form>

				</div>
				<div class="col-xs-3">

				</div>
		</div>
	</div>
""")))})),format.raw/*40.2*/("""
"""))}
    }
    
    def render(forumItem:Forum): play.api.templates.HtmlFormat.Appendable = apply(forumItem)
    
    def f:((Forum) => play.api.templates.HtmlFormat.Appendable) = (forumItem) => apply(forumItem)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 00:09:46 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/forumItem.scala.html
                    HASH: 294e380963b0ceefce9732a08a2c068ad0924fcf
                    MATRIX: 777->1|889->19|925->21|951->39|990->41|1026->43|1039->49|1069->58|1261->214|1279->223|1310->232|1405->292|1445->323|1484->324|1655->459|1673->468|1707->480|1810->547|1828->556|1855->561|1919->594|2336->980
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|40->12|40->12|40->12|42->14|42->14|42->14|46->18|46->18|46->18|49->21|49->21|49->21|52->24|68->40
                    -- GENERATED --
                */
            