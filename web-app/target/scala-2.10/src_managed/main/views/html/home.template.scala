
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


<div class="container-fluid">
	<div class="row clearfix">
		"""),_display_(Seq[Any](/*11.4*/navbar/*11.10*/.render())),format.raw/*11.19*/("""
	</div>

	<div class="row clearfix">
		<div class="col-xs-12 column">
		</div>
	</div>

	<div class="row clearfix">
		<div class="col-xs-2 column">
			<img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*21.66*/routes/*21.72*/.Assets.at("images/profile_holder.png"))),format.raw/*21.111*/("""" />

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

		<div class="col-xs-6 column clearfix">
		<img alt="140x140" class = "img-thumbnail profileImage" target="_blank" src=""""),_display_(Seq[Any](/*37.81*/routes/*37.87*/.Assets.at("images/header.jpg"))),format.raw/*37.118*/("""" />
			<div class="feed-div">
			"""),_display_(Seq[Any](/*39.5*/for(feedItem <- feedItems) yield /*39.31*/{_display_(Seq[Any](format.raw/*39.32*/("""
				"""),_display_(Seq[Any](/*40.6*/if(feedItem.publish_date != "")/*40.37*/{_display_(Seq[Any](format.raw/*40.38*/("""
					<a href=""""),_display_(Seq[Any](/*41.16*/feedItem/*41.24*/.url)),format.raw/*41.28*/("""" target="_blank" style="text-decoration: none;">
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<img alt="" class="feed-image feed-head" src=""""),_display_(Seq[Any](/*45.55*/routes/*45.61*/.Assets.at("images/tech.png"))),format.raw/*45.90*/("""" />
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*46.53*/feedItem/*46.61*/.title)),format.raw/*46.67*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*49.38*/feedItem/*49.46*/.summary)),format.raw/*49.54*/("""</p>
						<p class="foot-text">"""),_display_(Seq[Any](/*50.29*/feedItem/*50.37*/.publish_date)),format.raw/*50.50*/("""  """),_display_(Seq[Any](/*50.53*/feedItem/*50.61*/.source)),format.raw/*50.68*/("""</p>
					</div>
				</div>
				</a>
				""")))})),format.raw/*54.6*/("""
			""")))})),format.raw/*55.5*/("""
		</div>
		</div>
		<div class="col-xs-4 column">
			<div>
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
""")))})),format.raw/*81.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem]): play.api.templates.HtmlFormat.Appendable = apply(feedItems)
    
    def f:((List[FeedItem]) => play.api.templates.HtmlFormat.Appendable) = (feedItems) => apply(feedItems)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 22 09:04:48 PDT 2015
                    SOURCE: /home/beyondprosthetics/repos/school/proConnect/web-app/app/views/home.scala.html
                    HASH: 4261c4da5f9cde5a997fb2aff1656ed18cf77a62
                    MATRIX: 781->1|918->28|946->47|982->49|1008->67|1047->69|1114->101|1128->107|1187->145|1288->211|1303->217|1334->226|1584->440|1599->446|1661->485|2006->794|2021->800|2075->831|2145->866|2187->892|2226->893|2267->899|2307->930|2346->931|2398->947|2415->955|2441->959|2663->1145|2678->1151|2729->1180|2822->1237|2839->1245|2867->1251|2970->1318|2987->1326|3017->1334|3086->1367|3103->1375|3138->1388|3177->1391|3194->1399|3223->1406|3296->1448|3332->1453|4007->2097
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|49->21|49->21|49->21|65->37|65->37|65->37|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|73->45|73->45|73->45|74->46|74->46|74->46|77->49|77->49|77->49|78->50|78->50|78->50|78->50|78->50|78->50|82->54|83->55|109->81
                    -- GENERATED --
                */
            