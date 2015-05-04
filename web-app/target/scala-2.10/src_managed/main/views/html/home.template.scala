
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
				</dl>

		</div>
		</div>

		<div class="col-xs-6 column feed-container">
			<div class="feed-div">
			"""),_display_(Seq[Any](/*48.5*/for(feedItem <- feedItems) yield /*48.31*/{_display_(Seq[Any](format.raw/*48.32*/("""
				"""),_display_(Seq[Any](/*49.6*/if(feedItem.publish_date != "")/*49.37*/{_display_(Seq[Any](format.raw/*49.38*/("""
					<a href=""""),_display_(Seq[Any](/*50.16*/feedItem/*50.24*/.url)),format.raw/*50.28*/("""" target="_blank" style="text-decoration: none;">
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<img alt="" class="feed-image feed-head" src=""""),_display_(Seq[Any](/*54.55*/routes/*54.61*/.Assets.at("images/tech.png"))),format.raw/*54.90*/("""" />
							<h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*55.53*/feedItem/*55.61*/.title)),format.raw/*55.67*/("""</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*58.38*/feedItem/*58.46*/.summary)),format.raw/*58.54*/("""</p>
						<p class="foot-text">"""),_display_(Seq[Any](/*59.29*/feedItem/*59.37*/.publish_date)),format.raw/*59.50*/("""  """),_display_(Seq[Any](/*59.53*/feedItem/*59.61*/.source)),format.raw/*59.68*/("""</p>
					</div>
				</div>
				</a>
				""")))})),format.raw/*63.6*/("""
			""")))})),format.raw/*64.5*/("""
		</div>
		</div>
		<div class="col-xs-3 column" style="margin-top: 25px;">
			<div>
				<div class="panel panel-default">
				  <div class="panel-heading">Twitter Feed</div>
				  <div class="panel-body">
						"""),_display_(Seq[Any](/*72.8*/if(user.loginProvider == "twitter")/*72.43*/{_display_(Seq[Any](format.raw/*72.44*/("""
						<ul class="list-group overflow-y-scroll tweetTable">
							  <li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
								<li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
							</ul>
						""")))}/*81.8*/else/*81.12*/{_display_(Seq[Any](format.raw/*81.13*/("""
							<p>Enter your twitter information for a feed of recent tweets!</p>
						""")))})),format.raw/*83.8*/("""
				  </div>
				</div>
			</div>
		</div>


		</div>

  </div>
</div>
""")))})),format.raw/*94.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem],user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(feedItems,user)
    
    def f:((List[FeedItem],UserModel) => play.api.templates.HtmlFormat.Appendable) = (feedItems,user) => apply(feedItems,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 03 18:22:03 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: 682ddfe69fd58277b6144886eaa546f6214f0e82
                    MATRIX: 791->1|944->44|972->63|1008->65|1034->83|1073->85|1140->117|1154->123|1213->161|1336->249|1351->255|1382->264|1585->432|1625->463|1664->464|1754->518|1769->524|1830->563|1858->573|1871->577|1910->578|2014->646|2029->652|2091->691|2132->701|2215->749|2249->774|2288->775|2356->807|2369->811|2400->820|2429->831|2442->835|2481->836|2559->883|2622->911|2663->943|2702->944|2769->975|2782->979|2820->995|2862->1006|2925->1034|2963->1063|3002->1064|3070->1096|3083->1100|3118->1113|3161->1125|3315->1244|3357->1270|3396->1271|3437->1277|3477->1308|3516->1309|3568->1325|3585->1333|3611->1337|3833->1523|3848->1529|3899->1558|3992->1615|4009->1623|4037->1629|4140->1696|4157->1704|4187->1712|4256->1745|4273->1753|4308->1766|4347->1769|4364->1777|4393->1784|4466->1826|4502->1831|4751->2045|4795->2080|4834->2081|5251->2480|5264->2484|5303->2485|5416->2567|5520->2640
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|60->32|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|65->37|66->38|66->38|66->38|67->39|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|82->54|82->54|82->54|83->55|83->55|83->55|86->58|86->58|86->58|87->59|87->59|87->59|87->59|87->59|87->59|91->63|92->64|100->72|100->72|100->72|109->81|109->81|109->81|111->83|122->94
                    -- GENERATED --
                */
            