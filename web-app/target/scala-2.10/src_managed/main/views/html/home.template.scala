
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
						<ul class="list-group overflow-y-scroll connect-table">
							"""),_display_(Seq[Any](/*100.9*/for(connection <- connections) yield /*100.39*/{_display_(Seq[Any](format.raw/*100.40*/("""
								<a href=""""),_display_(Seq[Any](/*101.19*/routes/*101.25*/.SearchController.loadSearchedProfile(connection.email))),format.raw/*101.80*/("""">
									<li class="list-group-item">
									"""),_display_(Seq[Any](/*103.11*/if(connection.profilePicture != null)/*103.48*/{_display_(Seq[Any](format.raw/*103.49*/("""
										<img class = "connections-image feed-head" src=""""),_display_(Seq[Any](/*104.60*/routes/*104.66*/.DbController.getProfilePic(connection.email))),format.raw/*104.111*/("""" />
										""")))}/*105.12*/else/*105.16*/{_display_(Seq[Any](format.raw/*105.17*/("""
											<img alt="140x140" class = "connections-image feed-head" src=""""),_display_(Seq[Any](/*106.75*/routes/*106.81*/.Assets.at("images/profile_holder.png"))),format.raw/*106.120*/("""" />
										""")))})),format.raw/*107.12*/("""
										<p class="connect-text feed-head"> """),_display_(Seq[Any](/*108.47*/connection/*108.57*/.userName)),format.raw/*108.66*/("""</p>
										</li>
										</a>
								""")))})),format.raw/*111.10*/("""
							<li style="margin-top: 5px;">Use the search bar to find friends and business associates.</li>
							</ul>
						""")))}/*114.8*/else/*114.12*/{_display_(Seq[Any](format.raw/*114.13*/("""
							<p>Use the search bar to find friends and business associates.</p>
						""")))})),format.raw/*116.8*/("""
					</div>
				</div>

			</div>
		</div>


		</div>

  </div>
</div>
""")))})),format.raw/*128.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem],user:UserModel,connections:List[UserModel]): play.api.templates.HtmlFormat.Appendable = apply(feedItems,user,connections)
    
    def f:((List[FeedItem],UserModel,List[UserModel]) => play.api.templates.HtmlFormat.Appendable) = (feedItems,user,connections) => apply(feedItems,user,connections)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 22:57:25 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: 8ee4354512e574f7690998dbb508c7a649ed05f6
                    MATRIX: 807->1|990->74|1018->93|1054->95|1080->113|1119->115|1186->147|1200->153|1259->191|1382->279|1397->285|1428->294|1631->462|1671->493|1710->494|1800->548|1815->554|1876->593|1904->603|1917->607|1956->608|2060->676|2075->682|2137->721|2178->731|2261->779|2295->804|2334->805|2402->837|2415->841|2446->850|2475->861|2488->865|2527->866|2605->913|2668->941|2709->973|2748->974|2815->1005|2828->1009|2866->1025|2908->1036|2971->1064|3009->1093|3048->1094|3116->1126|3129->1130|3164->1143|3207->1155|3361->1274|3403->1300|3442->1301|3483->1307|3523->1338|3562->1339|3614->1355|3631->1363|3657->1367|3879->1553|3894->1559|3945->1588|4038->1645|4055->1653|4083->1659|4186->1726|4203->1734|4233->1742|4302->1775|4319->1783|4354->1796|4393->1799|4410->1807|4439->1814|4512->1856|4548->1861|4797->2075|4841->2110|4880->2111|5297->2510|5310->2514|5349->2515|5766->2901|5952->3052|5984->3075|6023->3076|6130->3147|6177->3177|6217->3178|6273->3197|6289->3203|6367->3258|6455->3309|6502->3346|6542->3347|6639->3407|6655->3413|6724->3458|6760->3474|6774->3478|6814->3479|6926->3554|6942->3560|7005->3599|7054->3615|7138->3662|7158->3672|7190->3681|7268->3726|7409->3848|7423->3852|7463->3853|7577->3935|7682->4008
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|60->32|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|65->37|66->38|66->38|66->38|67->39|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|82->54|82->54|82->54|83->55|83->55|83->55|86->58|86->58|86->58|87->59|87->59|87->59|87->59|87->59|87->59|91->63|92->64|100->72|100->72|100->72|109->81|109->81|109->81|119->91|126->98|126->98|126->98|128->100|128->100|128->100|129->101|129->101|129->101|131->103|131->103|131->103|132->104|132->104|132->104|133->105|133->105|133->105|134->106|134->106|134->106|135->107|136->108|136->108|136->108|139->111|142->114|142->114|142->114|144->116|156->128
                    -- GENERATED --
                */
            