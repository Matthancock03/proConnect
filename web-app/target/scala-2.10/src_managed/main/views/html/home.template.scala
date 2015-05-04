
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
					<a href=""""),_display_(Seq[Any](/*41.16*/routes/*41.22*/.Application.connections())),format.raw/*41.48*/(""""><p class="profile-text">Connections to Add</p></a><br/>
					<a href=""""),_display_(Seq[Any](/*42.16*/routes/*42.22*/.MessageController.message())),format.raw/*42.50*/(""""><p class="profile-text">Messages</p></a>
				</dl>

		</div>
		</div>

		<div class="col-xs-6 column feed-container">
			<div class="feed-div">
			"""),_display_(Seq[Any](/*50.5*/for(feedItem <- feedItems) yield /*50.31*/{_display_(Seq[Any](format.raw/*50.32*/("""
				"""),_display_(Seq[Any](/*51.6*/if(feedItem.publish_date != "")/*51.37*/{_display_(Seq[Any](format.raw/*51.38*/("""
					<a href=""""),_display_(Seq[Any](/*52.16*/feedItem/*52.24*/.url)),format.raw/*52.28*/("""" target="_blank" style="text-decoration: none;">
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<img alt="" class="feed-image feed-head" src=""""),_display_(Seq[Any](/*56.55*/routes/*56.61*/.Assets.at("images/tech.png"))),format.raw/*56.90*/("""" />
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*57.53*/feedItem/*57.61*/.title)),format.raw/*57.67*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*60.38*/feedItem/*60.46*/.summary)),format.raw/*60.54*/("""</p>
						<p class="foot-text">"""),_display_(Seq[Any](/*61.29*/feedItem/*61.37*/.publish_date)),format.raw/*61.50*/("""  """),_display_(Seq[Any](/*61.53*/feedItem/*61.61*/.source)),format.raw/*61.68*/("""</p>
					</div>
				</div>
				</a>
				""")))})),format.raw/*65.6*/("""
			""")))})),format.raw/*66.5*/("""
		</div>
		</div>
		<div class="col-xs-3 column" style="margin-top: 25px;">
			<div>
				<div class="panel panel-default">
				  <div class="panel-heading">Twitter Feed</div>
				  <div class="panel-body">
						"""),_display_(Seq[Any](/*74.8*/if(user.loginProvider == "twitter")/*74.43*/{_display_(Seq[Any](format.raw/*74.44*/("""
						<ul class="list-group overflow-y-scroll tweetTable">
							  <li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
								<li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
							</ul>
						""")))}/*83.8*/else/*83.12*/{_display_(Seq[Any](format.raw/*83.13*/("""
							<p>Enter your twitter information for a feed of recent tweets!</p>
						""")))})),format.raw/*85.8*/("""
				  </div>
				</div>
			</div>
		</div>


		</div>

  </div>
</div>
""")))})),format.raw/*96.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem],user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(feedItems,user)
    
    def f:((List[FeedItem],UserModel) => play.api.templates.HtmlFormat.Appendable) = (feedItems,user) => apply(feedItems,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 09:52:33 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: 86075844557555b9e0c2a65dab0dc95a02ce2c90
                    MATRIX: 791->1|944->44|972->63|1008->65|1034->83|1073->85|1140->117|1154->123|1213->161|1336->249|1351->255|1382->264|1585->432|1625->463|1664->464|1754->518|1769->524|1830->563|1858->573|1871->577|1910->578|2014->646|2029->652|2091->691|2132->701|2215->749|2249->774|2288->775|2356->807|2369->811|2400->820|2429->831|2442->835|2481->836|2559->883|2622->911|2663->943|2702->944|2769->975|2782->979|2820->995|2862->1006|2925->1034|2963->1063|3002->1064|3070->1096|3083->1100|3118->1113|3161->1125|3224->1152|3239->1158|3287->1184|3396->1257|3411->1263|3461->1291|3646->1441|3688->1467|3727->1468|3768->1474|3808->1505|3847->1506|3899->1522|3916->1530|3942->1534|4164->1720|4179->1726|4230->1755|4323->1812|4340->1820|4368->1826|4471->1893|4488->1901|4518->1909|4587->1942|4604->1950|4639->1963|4678->1966|4695->1974|4724->1981|4797->2023|4833->2028|5082->2242|5126->2277|5165->2278|5582->2677|5595->2681|5634->2682|5747->2764|5851->2837
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|60->32|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|69->41|70->42|70->42|70->42|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|84->56|84->56|84->56|85->57|85->57|85->57|88->60|88->60|88->60|89->61|89->61|89->61|89->61|89->61|89->61|93->65|94->66|102->74|102->74|102->74|111->83|111->83|111->83|113->85|124->96
                    -- GENERATED --
                */
            