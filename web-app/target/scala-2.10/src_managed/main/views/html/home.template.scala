
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
                    DATE: Thu Apr 30 14:37:20 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/home.scala.html
                    HASH: 275f064fef402f84e8de61f008705a86061ed560
                    MATRIX: 791->1|945->44|975->66|1012->69|1038->87|1077->89|1145->122|1159->128|1218->166|1346->259|1361->265|1392->274|1602->449|1642->480|1681->481|1708->490|1721->494|1760->495|1864->563|1879->569|1941->608|1983->619|2069->670|2103->695|2142->696|2211->729|2224->733|2255->742|2285->754|2298->758|2337->759|2417->808|2483->839|2524->871|2563->872|2631->904|2644->908|2682->924|2725->936|2791->967|2829->996|2868->997|2937->1030|2950->1034|2985->1047|3029->1060|3239->1234|3254->1240|3308->1271|3380->1308|3422->1334|3461->1335|3503->1342|3543->1373|3582->1374|3635->1391|3652->1399|3678->1403|3904->1593|3919->1599|3970->1628|4064->1686|4081->1694|4109->1700|4215->1770|4232->1778|4262->1786|4332->1820|4349->1828|4384->1841|4423->1844|4440->1852|4469->1859|4546->1905|4583->1911|4814->2107|4858->2142|4897->2143|5323->2551|5336->2555|5375->2556|5490->2640|5605->2724
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|60->32|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|65->37|66->38|66->38|66->38|67->39|75->47|75->47|75->47|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|83->55|83->55|83->55|84->56|84->56|84->56|87->59|87->59|87->59|88->60|88->60|88->60|88->60|88->60|88->60|92->64|93->65|101->73|101->73|101->73|110->82|110->82|110->82|112->84|123->95
                    -- GENERATED --
                */
            