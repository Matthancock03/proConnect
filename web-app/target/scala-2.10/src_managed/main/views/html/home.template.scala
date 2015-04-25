
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
                    DATE: Sat Apr 25 11:12:22 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: 5f3a2fe75d212425889738eaa68ea75129e15e6e
                    MATRIX: 786->1|934->39|962->58|998->60|1024->78|1063->80|1130->112|1144->118|1203->156|1326->244|1341->250|1372->259|1575->427|1615->458|1654->459|1679->466|1692->470|1731->471|1834->538|1849->544|1911->583|1952->593|2035->641|2069->666|2108->667|2176->699|2189->703|2220->712|2249->723|2262->727|2301->728|2379->775|2442->803|2483->835|2522->836|2585->868|2648->896|2686->925|2725->926|2796->966|2998->1132|3013->1138|3067->1169|3137->1204|3179->1230|3218->1231|3259->1237|3299->1268|3338->1269|3390->1285|3407->1293|3433->1297|3655->1483|3670->1489|3721->1518|3814->1575|3831->1583|3859->1589|3962->1656|3979->1664|4009->1672|4078->1705|4095->1713|4130->1726|4169->1729|4186->1737|4215->1744|4288->1786|4324->1791|4999->2435
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|60->32|60->32|60->32|62->34|65->37|65->37|65->37|67->39|75->47|75->47|75->47|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|83->55|83->55|83->55|84->56|84->56|84->56|87->59|87->59|87->59|88->60|88->60|88->60|88->60|88->60|88->60|92->64|93->65|119->91
                    -- GENERATED --
                */
            