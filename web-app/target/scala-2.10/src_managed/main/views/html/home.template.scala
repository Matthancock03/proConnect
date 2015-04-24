
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
						Beyond Prosthetics
					""")))})),format.raw/*34.7*/("""
					</dd>
					<dd>
					"""),_display_(Seq[Any](/*37.7*/if(user.recentSchool != null)/*37.36*/{_display_(Seq[Any](format.raw/*37.37*/("""
						San Jose State University
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
""")))})),format.raw/*91.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem],user:User): play.api.templates.HtmlFormat.Appendable = apply(feedItems,user)
    
    def f:((List[FeedItem],User) => play.api.templates.HtmlFormat.Appendable) = (feedItems,user) => apply(feedItems,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 24 14:08:30 PDT 2015
                    SOURCE: /home/beyondprosthetics/repos/school/proConnect/web-app/app/views/home.scala.html
                    HASH: b873292d24f26327fb5a923b55fb6f1c8754a836
                    MATRIX: 786->1|934->39|962->58|998->60|1024->78|1063->80|1130->112|1144->118|1203->156|1326->244|1341->250|1372->259|1575->427|1615->458|1654->459|1683->470|1696->474|1735->475|1838->542|1853->548|1915->587|1956->597|2039->645|2073->670|2112->671|2180->703|2193->707|2224->716|2253->727|2266->731|2305->732|2383->779|2446->807|2487->839|2526->840|2589->872|2652->900|2690->929|2729->930|2800->970|3006->1140|3021->1146|3075->1177|3145->1212|3187->1238|3226->1239|3267->1245|3307->1276|3346->1277|3398->1293|3415->1301|3441->1305|3663->1491|3678->1497|3729->1526|3822->1583|3839->1591|3867->1597|3970->1664|3987->1672|4017->1680|4086->1713|4103->1721|4138->1734|4177->1737|4194->1745|4223->1752|4296->1794|4332->1799|5007->2443
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|60->32|60->32|60->32|62->34|65->37|65->37|65->37|67->39|75->47|75->47|75->47|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|83->55|83->55|83->55|84->56|84->56|84->56|87->59|87->59|87->59|88->60|88->60|88->60|88->60|88->60|88->60|92->64|93->65|119->91
                    -- GENERATED --
                */
            