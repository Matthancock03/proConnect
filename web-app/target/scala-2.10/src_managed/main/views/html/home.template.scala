
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
					<img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*19.54*/routes/*19.60*/.DbController.getProfilePic(user.email))),format.raw/*19.99*/("""" />
				""")))}/*20.6*/else/*20.10*/{_display_(Seq[Any](format.raw/*20.11*/("""
					<img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*21.68*/routes/*21.74*/.Assets.at("images/profile_holder.png"))),format.raw/*21.113*/("""" />
				""")))})),format.raw/*22.6*/("""
				<dl class="dl-horizontal">
					<dt>
					"""),_display_(Seq[Any](/*25.7*/if(user.userName != null)/*25.32*/{_display_(Seq[Any](format.raw/*25.33*/("""
						<p class="profile-text">"""),_display_(Seq[Any](/*26.32*/user/*26.36*/.userName)),format.raw/*26.45*/("""</p>
					""")))}/*27.7*/else/*27.11*/{_display_(Seq[Any](format.raw/*27.12*/("""
						<p class="profile-text">Guest</p>
					""")))})),format.raw/*29.7*/("""
					<p>Connections to Add</p>
					</dt>
					<dd>
					"""),_display_(Seq[Any](/*33.7*/if(user.currentEmployer != null)/*33.39*/{_display_(Seq[Any](format.raw/*33.40*/("""
					<p class="profile-text">"""),_display_(Seq[Any](/*34.31*/user/*34.35*/.currentEmployer)),format.raw/*34.51*/("""</p>
					""")))})),format.raw/*35.7*/("""
					</dd>
					<dd>
					"""),_display_(Seq[Any](/*38.7*/if(user.recentSchool != null)/*38.36*/{_display_(Seq[Any](format.raw/*38.37*/("""
						<p class="profile-text">"""),_display_(Seq[Any](/*39.32*/user/*39.36*/.recentSchool)),format.raw/*39.49*/("""</p>
						""")))})),format.raw/*40.8*/("""
					</dd>
				</dl>

		</div>
		</div>

		<div class="col-xs-6 column feed-container">
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
		<div class="col-xs-3 column" style="margin-top: 25px;">
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
                    DATE: Sun May 03 21:17:32 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: 00cbcc5948e47d9bceda43056bc0d48bb2e6713a
                    MATRIX: 791->1|944->44|972->63|1008->65|1034->83|1073->85|1140->117|1154->123|1213->161|1336->249|1351->255|1382->264|1585->432|1625->463|1664->464|1754->518|1769->524|1830->563|1858->573|1871->577|1910->578|2014->646|2029->652|2091->691|2132->701|2215->749|2249->774|2288->775|2356->807|2369->811|2400->820|2429->831|2442->835|2481->836|2559->883|2653->942|2694->974|2733->975|2800->1006|2813->1010|2851->1026|2893->1037|2956->1065|2994->1094|3033->1095|3101->1127|3114->1131|3149->1144|3192->1156|3346->1275|3388->1301|3427->1302|3468->1308|3508->1339|3547->1340|3599->1356|3616->1364|3642->1368|3864->1554|3879->1560|3930->1589|4023->1646|4040->1654|4068->1660|4171->1727|4188->1735|4218->1743|4287->1776|4304->1784|4339->1797|4378->1800|4395->1808|4424->1815|4497->1857|4533->1862|4782->2076|4826->2111|4865->2112|5282->2511|5295->2515|5334->2516|5447->2598|5551->2671
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|61->33|61->33|61->33|62->34|62->34|62->34|63->35|66->38|66->38|66->38|67->39|67->39|67->39|68->40|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|83->55|83->55|83->55|84->56|84->56|84->56|87->59|87->59|87->59|88->60|88->60|88->60|88->60|88->60|88->60|92->64|93->65|101->73|101->73|101->73|110->82|110->82|110->82|112->84|123->95
                    -- GENERATED --
                */
            