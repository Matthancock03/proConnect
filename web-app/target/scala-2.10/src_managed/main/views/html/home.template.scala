
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[FeedItem],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(feedItems: List[FeedItem]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ProConnect")/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*6.32*/routes/*6.38*/.Assets.at("stylesheets/home.min.css"))),format.raw/*6.76*/("""">


<div class="container-fluid" style="height: 100%;">
	<div class="row clearfix" style="width: 100%;">
		"""),_display_(Seq[Any](/*11.4*/navbar/*11.10*/.render())),format.raw/*11.19*/("""
	</div>


	<div class="row clearfix" style="height: 100%;">
		<div class="col-xs-3 column profile-div">
			<img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.66*/routes/*17.72*/.Assets.at("images/profile_holder.png"))),format.raw/*17.111*/("""" />

			<dl class="dl-horizontal">
				<dt>
					Matthew Hancock
				</dt>
				<dd>
					Beyond Prosthetics
				</dd>
				<dd>
					San Jose State University
				</dd>
			</dl>
		</div>

		<div class="col-xs-6 column clearfix feed-container">
		<img alt="140x140" class = "img-thumbnail headImage" target="_blank" src=""""),_display_(Seq[Any](/*33.78*/routes/*33.84*/.Assets.at("images/header.jpg"))),format.raw/*33.115*/("""" />
			<div class="feed-div">
			"""),_display_(Seq[Any](/*35.5*/for(feedItem <- feedItems) yield /*35.31*/{_display_(Seq[Any](format.raw/*35.32*/("""
				"""),_display_(Seq[Any](/*36.6*/if(feedItem.publish_date != "")/*36.37*/{_display_(Seq[Any](format.raw/*36.38*/("""
					<a href=""""),_display_(Seq[Any](/*37.16*/feedItem/*37.24*/.url)),format.raw/*37.28*/("""" target="_blank" style="text-decoration: none;">
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<img alt="" class="feed-image feed-head" src=""""),_display_(Seq[Any](/*41.55*/routes/*41.61*/.Assets.at("images/tech.png"))),format.raw/*41.90*/("""" />
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*42.53*/feedItem/*42.61*/.title)),format.raw/*42.67*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*45.38*/feedItem/*45.46*/.summary)),format.raw/*45.54*/("""</p>
						<p class="foot-text">"""),_display_(Seq[Any](/*46.29*/feedItem/*46.37*/.publish_date)),format.raw/*46.50*/("""  """),_display_(Seq[Any](/*46.53*/feedItem/*46.61*/.source)),format.raw/*46.68*/("""</p>
					</div>
				</div>
				</a>
				""")))})),format.raw/*50.6*/("""
			""")))})),format.raw/*51.5*/("""
		</div>
		</div>
		<div class="col-xs-3 column clearfix">
			<div style="padding-top: 10px;">
				<div class="panel panel-default">
				  <div class="panel-heading">Twitter Feed</div>
				  <div class="panel-body">
						<ul class="list-group overflow-y-scroll tweetTable">
							  <li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
								<li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
							</ul>
				  </div>
				</div>
			</div>
		</div>


		</div>

  </div>
</div>
""")))})),format.raw/*77.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem]): play.api.templates.HtmlFormat.Appendable = apply(feedItems)
    
    def f:((List[FeedItem]) => play.api.templates.HtmlFormat.Appendable) = (feedItems) => apply(feedItems)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 22 20:39:50 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: d40a1a62891bc8b02625f6fab90476f80092632e
                    MATRIX: 781->1|918->28|946->47|982->49|1008->67|1047->69|1114->101|1128->107|1187->145|1331->254|1346->260|1377->269|1583->439|1598->445|1660->484|2017->805|2032->811|2086->842|2156->877|2198->903|2237->904|2278->910|2318->941|2357->942|2409->958|2426->966|2452->970|2674->1156|2689->1162|2740->1191|2833->1248|2850->1256|2878->1262|2981->1329|2998->1337|3028->1345|3097->1378|3114->1386|3149->1399|3188->1402|3205->1410|3234->1417|3307->1459|3343->1464|4054->2144
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|45->17|45->17|45->17|61->33|61->33|61->33|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|69->41|69->41|69->41|70->42|70->42|70->42|73->45|73->45|73->45|74->46|74->46|74->46|74->46|74->46|74->46|78->50|79->51|105->77
                    -- GENERATED --
                */
            