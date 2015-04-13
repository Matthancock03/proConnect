
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[FeedItem,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(feedItem: FeedItem):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.22*/("""

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
				"""),_display_(Seq[Any](/*37.6*/if(feedItem.publish_date != "")/*37.37*/{_display_(Seq[Any](format.raw/*37.38*/("""
					<p>"""),_display_(Seq[Any](/*38.10*/feedItem/*38.18*/.publish_date)),format.raw/*38.31*/("""</p>
					<p>"""),_display_(Seq[Any](/*39.10*/feedItem/*39.18*/.source)),format.raw/*39.25*/("""</p>
					<p>"""),_display_(Seq[Any](/*40.10*/feedItem/*40.18*/.source_url)),format.raw/*40.29*/("""</p>
					<p>"""),_display_(Seq[Any](/*41.10*/feedItem/*41.18*/.summary)),format.raw/*41.26*/("""</p>
					<p>"""),_display_(Seq[Any](/*42.10*/feedItem/*42.18*/.title)),format.raw/*42.24*/("""</p>
					<p>"""),_display_(Seq[Any](/*43.10*/feedItem/*43.18*/.url)),format.raw/*43.22*/("""</p>
				""")))})),format.raw/*44.6*/("""

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
""")))})),format.raw/*70.2*/("""
"""))}
    }
    
    def render(feedItem:FeedItem): play.api.templates.HtmlFormat.Appendable = apply(feedItem)
    
    def f:((FeedItem) => play.api.templates.HtmlFormat.Appendable) = (feedItem) => apply(feedItem)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 12 16:18:27 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: a6d59e1d5287ee91ace3ccdf9bc785fb3521b356
                    MATRIX: 775->1|905->21|933->40|969->42|995->60|1034->62|1101->94|1115->100|1174->138|1275->204|1290->210|1321->219|1835->698|1875->729|1914->730|1960->740|1977->748|2012->761|2062->775|2079->783|2108->790|2158->804|2175->812|2208->823|2258->837|2275->845|2305->853|2355->867|2372->875|2400->881|2450->895|2467->903|2493->907|2534->917|3201->1553
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|98->70
                    -- GENERATED --
                */
            