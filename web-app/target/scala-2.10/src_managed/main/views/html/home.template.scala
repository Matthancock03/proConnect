
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
					<a href=""""),_display_(Seq[Any](/*41.16*/feedItem/*41.24*/.url)),format.raw/*41.28*/("""" style="text-decoration: none;">
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
                    DATE: Sun Apr 19 16:21:50 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: d1d26c950e83aac048e6744ed2b9ce88d6b00997
                    MATRIX: 781->1|918->28|946->47|982->49|1008->67|1047->69|1114->101|1128->107|1187->145|1288->211|1303->217|1334->226|1584->440|1599->446|1661->485|2006->794|2021->800|2075->831|2145->866|2187->892|2226->893|2267->899|2307->930|2346->931|2398->947|2415->955|2441->959|2647->1129|2662->1135|2713->1164|2806->1221|2823->1229|2851->1235|2954->1302|2971->1310|3001->1318|3070->1351|3087->1359|3122->1372|3161->1375|3178->1383|3207->1390|3280->1432|3316->1437|3991->2081
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|49->21|49->21|49->21|65->37|65->37|65->37|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|73->45|73->45|73->45|74->46|74->46|74->46|77->49|77->49|77->49|78->50|78->50|78->50|78->50|78->50|78->50|82->54|83->55|109->81
                    -- GENERATED --
                */
            