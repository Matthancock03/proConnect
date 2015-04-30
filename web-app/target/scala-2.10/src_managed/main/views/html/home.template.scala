
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[FeedItem],UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(feedItems: List[FeedItem], user:UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""

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
				"""),_display_(Seq[Any](/*18.6*/if(user.profilePicture != null)/*18.37*/{_display_(Seq[Any](format.raw/*18.38*/("""

				""")))}/*20.6*/else/*20.10*/{_display_(Seq[Any](format.raw/*20.11*/("""
				<img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*21.67*/routes/*21.73*/.Assets.at("images/profile_holder.png"))),format.raw/*21.112*/("""" />
				""")))})),format.raw/*22.6*/("""
				<dl class="dl-horizontal">
					<dt>
					"""),_display_(Seq[Any](/*25.7*/if(user.userName != null)/*25.32*/{_display_(Seq[Any](format.raw/*25.33*/("""
						<p class="profile-text">"""),_display_(Seq[Any](/*26.32*/user/*26.36*/.userName)),format.raw/*26.45*/("""</p>
					""")))}/*27.7*/else/*27.11*/{_display_(Seq[Any](format.raw/*27.12*/("""
						<p class="profile-text">Guest</p>
					""")))})),format.raw/*29.7*/("""
					</dt>
					<dd>
					"""),_display_(Seq[Any](/*32.7*/if(user.currentEmployer != null)/*32.39*/{_display_(Seq[Any](format.raw/*32.40*/("""
					<p class="profile-text">"""),_display_(Seq[Any](/*33.31*/user/*33.35*/.currentEmployer)),format.raw/*33.51*/("""</p>
					""")))})),format.raw/*34.7*/("""
					</dd>
					<dd>
					"""),_display_(Seq[Any](/*37.7*/if(user.recentSchool != null)/*37.36*/{_display_(Seq[Any](format.raw/*37.37*/("""
						<p class="profile-text">"""),_display_(Seq[Any](/*38.32*/user/*38.36*/.recentSchool)),format.raw/*38.49*/("""</p>
						""")))})),format.raw/*39.8*/("""
					</dd>
				</dl>

		</div>
		</div>

		<div class="col-xs-6 column feed-container">
		<img alt="140x140" class = "img-thumbnail headImage" target="_blank" src=""""),_display_(Seq[Any](/*47.78*/routes/*47.84*/.Assets.at("images/header.jpg"))),format.raw/*47.115*/("""" />
			<div class="feed-div">
			"""),_display_(Seq[Any](/*49.5*/for(feedItem <- feedItems) yield /*49.31*/{_display_(Seq[Any](format.raw/*49.32*/("""
				"""),_display_(Seq[Any](/*50.6*/if(feedItem.publish_date != "")/*50.37*/{_display_(Seq[Any](format.raw/*50.38*/("""
					<a href=""""),_display_(Seq[Any](/*51.16*/feedItem/*51.24*/.url)),format.raw/*51.28*/("""" target="_blank" style="text-decoration: none;">
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<img alt="" class="feed-image feed-head" src=""""),_display_(Seq[Any](/*55.55*/routes/*55.61*/.Assets.at("images/tech.png"))),format.raw/*55.90*/("""" />
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*56.53*/feedItem/*56.61*/.title)),format.raw/*56.67*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*59.38*/feedItem/*59.46*/.summary)),format.raw/*59.54*/("""</p>
						<p class="foot-text">"""),_display_(Seq[Any](/*60.29*/feedItem/*60.37*/.publish_date)),format.raw/*60.50*/("""  """),_display_(Seq[Any](/*60.53*/feedItem/*60.61*/.source)),format.raw/*60.68*/("""</p>
					</div>
				</div>
				</a>
				""")))})),format.raw/*64.6*/("""
			""")))})),format.raw/*65.5*/("""
		</div>
		</div>
		<div class="col-xs-3 column">
			<div>
				<div class="panel panel-default">
				  <div class="panel-heading">Twitter Feed</div>
				  <div class="panel-body">
						"""),_display_(Seq[Any](/*73.8*/if(user.loginProvider == "twitter")/*73.43*/{_display_(Seq[Any](format.raw/*73.44*/("""
						<ul class="list-group overflow-y-scroll tweetTable">
							  <li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
								<li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
							</ul>
						""")))}/*82.8*/else/*82.12*/{_display_(Seq[Any](format.raw/*82.13*/("""
							<p>Enter your twitter information for a feed of recent tweets!</p>
						""")))})),format.raw/*84.8*/("""
				  </div>
				</div>
			</div>
		</div>


		</div>

  </div>
</div>
""")))})),format.raw/*95.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem],user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(feedItems,user)
    
    def f:((List[FeedItem],UserModel) => play.api.templates.HtmlFormat.Appendable) = (feedItems,user) => apply(feedItems,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 30 13:45:44 PDT 2015
                    SOURCE: /home/beyondprosthetics/repos/school/proConnect/web-app/app/views/home.scala.html
                    HASH: 59352adddb331a4888d61d1d678cc587e722fa70
                    MATRIX: 791->1|944->44|972->63|1008->65|1034->83|1073->85|1140->117|1154->123|1213->161|1336->249|1351->255|1382->264|1585->432|1625->463|1664->464|1689->471|1702->475|1741->476|1844->543|1859->549|1921->588|1962->598|2045->646|2079->671|2118->672|2186->704|2199->708|2230->717|2259->728|2272->732|2311->733|2389->780|2452->808|2493->840|2532->841|2599->872|2612->876|2650->892|2692->903|2755->931|2793->960|2832->961|2900->993|2913->997|2948->1010|2991->1022|3193->1188|3208->1194|3262->1225|3332->1260|3374->1286|3413->1287|3454->1293|3494->1324|3533->1325|3585->1341|3602->1349|3628->1353|3850->1539|3865->1545|3916->1574|4009->1631|4026->1639|4054->1645|4157->1712|4174->1720|4204->1728|4273->1761|4290->1769|4325->1782|4364->1785|4381->1793|4410->1800|4483->1842|4519->1847|4742->2035|4786->2070|4825->2071|5242->2470|5255->2474|5294->2475|5407->2557|5511->2630
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|60->32|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|65->37|66->38|66->38|66->38|67->39|75->47|75->47|75->47|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|83->55|83->55|83->55|84->56|84->56|84->56|87->59|87->59|87->59|88->60|88->60|88->60|88->60|88->60|88->60|92->64|93->65|101->73|101->73|101->73|110->82|110->82|110->82|112->84|123->95
                    -- GENERATED --
                */
            