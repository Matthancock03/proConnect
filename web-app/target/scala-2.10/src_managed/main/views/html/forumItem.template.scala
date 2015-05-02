
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
object forumItem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Forum],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forumItems: List[Forum]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""
"""),_display_(Seq[Any](/*2.2*/main("ProConnect")/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""
"""),_display_(Seq[Any](/*3.2*/navbar/*3.8*/.render())),format.raw/*3.17*/("""


<div class="container-fluid">

		<div class="feed-div">
			"""),_display_(Seq[Any](/*9.5*/for(forumItem <- forumItems) yield /*9.33*/{_display_(Seq[Any](format.raw/*9.34*/("""
				"""),_display_(Seq[Any](/*10.6*/if(forumItem.topicHeader != "")/*10.37*/{_display_(Seq[Any](format.raw/*10.38*/("""
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*14.53*/forumItem/*14.62*/.topicHeader)),format.raw/*14.74*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*17.38*/forumItem/*17.47*/.body)),format.raw/*17.52*/("""</p>
					</div>
				</div>
				""")))})),format.raw/*20.6*/("""

			""")))})),format.raw/*22.5*/("""
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
""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(forumItems:List[Forum]): play.api.templates.HtmlFormat.Appendable = apply(forumItems)
    
    def f:((List[Forum]) => play.api.templates.HtmlFormat.Appendable) = (forumItems) => apply(forumItems)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Sat May 02 15:50:34 MST 2015
                    SOURCE: C:/Users/Eya/Documents/GitHub/proConnect/web-app/app/views/forumItem.scala.html
                    HASH: a9b3d3c40fc6b90983ed3c80cbbfc0a4825f4022
                    MATRIX: 783->1|902->26|939->29|965->47|1004->49|1041->52|1054->58|1084->67|1187->136|1230->164|1268->165|1310->172|1350->203|1389->204|1564->343|1582->352|1616->364|1722->434|1740->443|1767->448|1834->484|1873->492|2295->883
=======
                    DATE: Sat May 02 14:04:39 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/forumItem.scala.html
                    HASH: 0b322a23a3a1cf7dfbaad8903ce81ea409677936
                    MATRIX: 783->1|902->26|938->28|964->46|1003->48|1039->50|1052->56|1082->65|1179->128|1222->156|1260->157|1301->163|1341->194|1380->195|1551->330|1569->339|1603->351|1706->418|1724->427|1751->432|1815->465|1852->471|2258->846
>>>>>>> 8f9ed6157bd56181ad0b73743b3620babe9daf06
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14|45->17|45->17|45->17|48->20|50->22|66->38
                    -- GENERATED --
                */
            