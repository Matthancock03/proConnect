
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
			<img alt="140x140" class = "img-thumbnail profileImage" src="http://i.imgur.com/PcoAz60.jpg?1" />

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
			<img alt="" src=""""),_display_(Seq[Any](/*37.22*/routes/*37.28*/.Assets.at("images/header.jpg"))),format.raw/*37.59*/("""" />
			<div class="feed-div">
			"""),_display_(Seq[Any](/*39.5*/for(feedItem <- feedItems) yield /*39.31*/{_display_(Seq[Any](format.raw/*39.32*/("""
				"""),_display_(Seq[Any](/*40.6*/if(feedItem.publish_date != "")/*40.37*/{_display_(Seq[Any](format.raw/*40.38*/("""
					<a href=""""),_display_(Seq[Any](/*41.16*/feedItem/*41.24*/.url)),format.raw/*41.28*/("""" style="text-decoration: none;">
					<div class="panel panel-default">
						<div class="panel-body">
						<h3 class="panel-title head-text">"""),_display_(Seq[Any](/*44.42*/feedItem/*44.50*/.title)),format.raw/*44.56*/("""</h3>
						<br>
						<p>"""),_display_(Seq[Any](/*46.11*/feedItem/*46.19*/.summary)),format.raw/*46.27*/("""</p>
						<p class="foot-text">"""),_display_(Seq[Any](/*47.29*/feedItem/*47.37*/.publish_date)),format.raw/*47.50*/("""  """),_display_(Seq[Any](/*47.53*/feedItem/*47.61*/.source)),format.raw/*47.68*/("""</p>
					</div>
				</div>
				</a>
				""")))})),format.raw/*51.6*/("""
			""")))})),format.raw/*52.5*/("""
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
""")))})),format.raw/*78.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem]): play.api.templates.HtmlFormat.Appendable = apply(feedItems)
    
    def f:((List[FeedItem]) => play.api.templates.HtmlFormat.Appendable) = (feedItems) => apply(feedItems)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 12 23:59:20 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: eba20ad3ebc0be19cb49fd27a2889b3abe83a3de
                    MATRIX: 781->1|918->28|946->47|982->49|1008->67|1047->69|1114->101|1128->107|1187->145|1288->211|1303->217|1334->226|1865->721|1880->727|1933->758|2003->793|2045->819|2084->820|2125->826|2165->857|2204->858|2256->874|2273->882|2299->886|2480->1031|2497->1039|2525->1045|2588->1072|2605->1080|2635->1088|2704->1121|2721->1129|2756->1142|2795->1145|2812->1153|2841->1160|2914->1202|2950->1207|3625->1851
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|65->37|65->37|65->37|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|72->44|72->44|72->44|74->46|74->46|74->46|75->47|75->47|75->47|75->47|75->47|75->47|79->51|80->52|106->78
                    -- GENERATED --
                */
            