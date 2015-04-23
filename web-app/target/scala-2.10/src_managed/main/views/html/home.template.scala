
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[FeedItem],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(feedItems: List[FeedItem], user:User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ProConnect")/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*6.32*/routes/*6.38*/.Assets.at("stylesheets/home.min.css"))),format.raw/*6.76*/("""">


<div class="container-fluid" style="height: 100%;">
	<div class="row clearfix">
		"""),_display_(Seq[Any](/*11.4*/navbar/*11.10*/.render())),format.raw/*11.19*/("""
	</div>


	<div class="row clearfix" style="height: 100%;">
		<div class="col-xs-3 column" style="padding-left: 0px; height: 100%;">
			<div class="profile-div">
				<img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*18.67*/routes/*18.73*/.Assets.at("images/profile_holder.png"))),format.raw/*18.112*/("""" />

				<dl class="dl-horizontal">
					<dt>
						<p class="profile-text">Matthew Hancock</p>
					</dt>
					<dd>
						Beyond Prosthetics
					</dd>
					<dd>
						San Jose State University
					</dd>
				</dl>
		</div>
		</div>

		<div class="col-xs-6 column feed-container">
		<img alt="140x140" class = "img-thumbnail headImage" target="_blank" src=""""),_display_(Seq[Any](/*35.78*/routes/*35.84*/.Assets.at("images/header.jpg"))),format.raw/*35.115*/("""" />
			<div class="feed-div">
			"""),_display_(Seq[Any](/*37.5*/for(feedItem <- feedItems) yield /*37.31*/{_display_(Seq[Any](format.raw/*37.32*/("""
				"""),_display_(Seq[Any](/*38.6*/if(feedItem.publish_date != "")/*38.37*/{_display_(Seq[Any](format.raw/*38.38*/("""
					<a href=""""),_display_(Seq[Any](/*39.16*/feedItem/*39.24*/.url)),format.raw/*39.28*/("""" target="_blank" style="text-decoration: none;">
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<img alt="" class="feed-image feed-head" src=""""),_display_(Seq[Any](/*43.55*/routes/*43.61*/.Assets.at("images/tech.png"))),format.raw/*43.90*/("""" />
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*44.53*/feedItem/*44.61*/.title)),format.raw/*44.67*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*47.38*/feedItem/*47.46*/.summary)),format.raw/*47.54*/("""</p>
						<p class="foot-text">"""),_display_(Seq[Any](/*48.29*/feedItem/*48.37*/.publish_date)),format.raw/*48.50*/("""  """),_display_(Seq[Any](/*48.53*/feedItem/*48.61*/.source)),format.raw/*48.68*/("""</p>
					</div>
				</div>
				</a>
				""")))})),format.raw/*52.6*/("""
			""")))})),format.raw/*53.5*/("""
		</div>
		</div>
		<div class="col-xs-3 column">
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
""")))})),format.raw/*79.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem],user:User): play.api.templates.HtmlFormat.Appendable = apply(feedItems,user)
    
    def f:((List[FeedItem],User) => play.api.templates.HtmlFormat.Appendable) = (feedItems,user) => apply(feedItems,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 22 21:33:16 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: 25e08e296512ab47154fb44b3be2899c9a43c6ba
                    MATRIX: 786->1|934->39|962->58|998->60|1024->78|1063->80|1130->112|1144->118|1203->156|1326->244|1341->250|1372->259|1637->488|1652->494|1714->533|2110->893|2125->899|2179->930|2249->965|2291->991|2330->992|2371->998|2411->1029|2450->1030|2502->1046|2519->1054|2545->1058|2767->1244|2782->1250|2833->1279|2926->1336|2943->1344|2971->1350|3074->1417|3091->1425|3121->1433|3190->1466|3207->1474|3242->1487|3281->1490|3298->1498|3327->1505|3400->1547|3436->1552|4111->2196
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|63->35|63->35|63->35|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|71->43|71->43|71->43|72->44|72->44|72->44|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|80->52|81->53|107->79
                    -- GENERATED --
                */
            