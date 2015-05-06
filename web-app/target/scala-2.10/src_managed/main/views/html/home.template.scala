
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[FeedItem],UserModel,List[UserModel],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(feedItems: List[FeedItem], user:UserModel, connections: List[UserModel]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.75*/("""

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

							<div class="input-group">
					      <input type="text" class="form-control" placeholder="Search Tweets">
					      <span class="input-group-btn">
					        <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span>
						      </button>
					      </span>
					    </div>
							<p>Enter a query for a feed of recent tweets!</p>
						""")))})),format.raw/*91.8*/("""
				  </div>
				</div>

				<div class="panel panel-default">
					<div class="panel-heading">Connections</div>
					<div class="panel-body">
						"""),_display_(Seq[Any](/*98.8*/if(connections != null)/*98.31*/{_display_(Seq[Any](format.raw/*98.32*/("""
						<ul class="list-group overflow-y-scroll tweetTable">
							"""),_display_(Seq[Any](/*100.9*/for(connection <- connections) yield /*100.39*/{_display_(Seq[Any](format.raw/*100.40*/("""
								<a href=""""),_display_(Seq[Any](/*101.19*/routes/*101.25*/.SearchController.loadSearchedProfile(connection.email))),format.raw/*101.80*/(""""><li class="list-group-item">"""),_display_(Seq[Any](/*101.111*/connection/*101.121*/.userName)),format.raw/*101.130*/("""</li></a>
							""")))})),format.raw/*102.9*/("""
							<li>Use the search bar to find friends and business associates.</li>
							</ul>
						""")))}/*105.8*/else/*105.12*/{_display_(Seq[Any](format.raw/*105.13*/("""
							<p>Use the search bar to find friends and business associates.</p>
						""")))})),format.raw/*107.8*/("""
					</div>
				</div>

			</div>
		</div>


		</div>

  </div>
</div>
""")))})),format.raw/*119.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem],user:UserModel,connections:List[UserModel]): play.api.templates.HtmlFormat.Appendable = apply(feedItems,user,connections)
    
    def f:((List[FeedItem],UserModel,List[UserModel]) => play.api.templates.HtmlFormat.Appendable) = (feedItems,user,connections) => apply(feedItems,user,connections)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 12:46:28 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/home.scala.html
                    HASH: de6db0bc5c9a5cb7c7f01524dbd22bb1d8709183
                    MATRIX: 807->1|991->74|1021->96|1058->99|1084->117|1123->119|1191->152|1205->158|1264->196|1392->289|1407->295|1438->304|1648->479|1688->510|1727->511|1818->566|1833->572|1894->611|1923->622|1936->626|1975->627|2080->696|2095->702|2157->741|2199->752|2285->803|2319->828|2358->829|2427->862|2440->866|2471->875|2501->887|2514->891|2553->892|2633->941|2699->972|2740->1004|2779->1005|2847->1037|2860->1041|2898->1057|2941->1069|3007->1100|3045->1129|3084->1130|3153->1163|3166->1167|3201->1180|3245->1193|3408->1321|3450->1347|3489->1348|3531->1355|3571->1386|3610->1387|3663->1404|3680->1412|3706->1416|3932->1606|3947->1612|3998->1641|4092->1699|4109->1707|4137->1713|4243->1783|4260->1791|4290->1799|4360->1833|4377->1841|4412->1854|4451->1857|4468->1865|4497->1872|4574->1918|4611->1924|4868->2146|4912->2181|4951->2182|5377->2590|5390->2594|5429->2595|5856->2991|6049->3149|6081->3172|6120->3173|6226->3243|6273->3273|6313->3274|6370->3294|6386->3300|6464->3355|6533->3386|6554->3396|6587->3405|6638->3424|6757->3524|6771->3528|6811->3529|6927->3613|7044->3698
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|60->32|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|65->37|66->38|66->38|66->38|67->39|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|82->54|82->54|82->54|83->55|83->55|83->55|86->58|86->58|86->58|87->59|87->59|87->59|87->59|87->59|87->59|91->63|92->64|100->72|100->72|100->72|109->81|109->81|109->81|119->91|126->98|126->98|126->98|128->100|128->100|128->100|129->101|129->101|129->101|129->101|129->101|129->101|130->102|133->105|133->105|133->105|135->107|147->119
                    -- GENERATED --
                */
            