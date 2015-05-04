
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
					<a href="#" class="btn" type="button">Connections to Add</a><br/>
					<a href="#" class="btn" type="button">Messages</a>
					</dt>
					<dd>
					"""),_display_(Seq[Any](/*34.7*/if(user.currentEmployer != null)/*34.39*/{_display_(Seq[Any](format.raw/*34.40*/("""
					<p class="profile-text">"""),_display_(Seq[Any](/*35.31*/user/*35.35*/.currentEmployer)),format.raw/*35.51*/("""</p>
					""")))})),format.raw/*36.7*/("""
					</dd>
					<dd>
					"""),_display_(Seq[Any](/*39.7*/if(user.recentSchool != null)/*39.36*/{_display_(Seq[Any](format.raw/*39.37*/("""
						<p class="profile-text">"""),_display_(Seq[Any](/*40.32*/user/*40.36*/.recentSchool)),format.raw/*40.49*/("""</p>
						""")))})),format.raw/*41.8*/("""
					</dd>
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
                    DATE: Sun May 03 21:22:30 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: 02d60bc3d3ae6358ca369f483f1c943f6b5dd3a1
                    MATRIX: 791->1|944->44|972->63|1008->65|1034->83|1073->85|1140->117|1154->123|1213->161|1336->249|1351->255|1382->264|1585->432|1625->463|1664->464|1754->518|1769->524|1830->563|1858->573|1871->577|1910->578|2014->646|2029->652|2091->691|2132->701|2215->749|2249->774|2288->775|2356->807|2369->811|2400->820|2429->831|2442->835|2481->836|2559->883|2749->1038|2790->1070|2829->1071|2896->1102|2909->1106|2947->1122|2989->1133|3052->1161|3090->1190|3129->1191|3197->1223|3210->1227|3245->1240|3288->1252|3442->1371|3484->1397|3523->1398|3564->1404|3604->1435|3643->1436|3695->1452|3712->1460|3738->1464|3960->1650|3975->1656|4026->1685|4119->1742|4136->1750|4164->1756|4267->1823|4284->1831|4314->1839|4383->1872|4400->1880|4435->1893|4474->1896|4491->1904|4520->1911|4593->1953|4629->1958|4878->2172|4922->2207|4961->2208|5378->2607|5391->2611|5430->2612|5543->2694|5647->2767
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|62->34|62->34|62->34|63->35|63->35|63->35|64->36|67->39|67->39|67->39|68->40|68->40|68->40|69->41|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|84->56|84->56|84->56|85->57|85->57|85->57|88->60|88->60|88->60|89->61|89->61|89->61|89->61|89->61|89->61|93->65|94->66|102->74|102->74|102->74|111->83|111->83|111->83|113->85|124->96
                    -- GENERATED --
                */
            