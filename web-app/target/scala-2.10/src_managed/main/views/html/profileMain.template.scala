
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
object profileMain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[UserModel],UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: Form[UserModel], userModel: UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.47*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ProConnect")/*5.20*/{_display_(Seq[Any](format.raw/*5.21*/("""
  """),_display_(Seq[Any](/*6.4*/navbar/*6.10*/.render)),format.raw/*6.17*/("""

<link rel="stylesheet" href=""""),_display_(Seq[Any](/*8.31*/routes/*8.37*/.Assets.at("stylesheets/editProfile.css"))),format.raw/*8.78*/("""">

<div class="container-fluid">
	<div class="row clearfix">
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.DbController.saveUser, 'enctype -> "multipart/form-data")/*12.91*/{_display_(Seq[Any](format.raw/*12.92*/("""

		<div class="col-xs-3 column logo-img img-div">

      """),_display_(Seq[Any](/*16.8*/if(userModel.profilePicture != null)/*16.44*/{_display_(Seq[Any](format.raw/*16.45*/("""
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.57*/routes/*17.63*/.DbController.getProfilePic(userModel.email))),format.raw/*17.107*/("""" />
      """)))}/*18.8*/else/*18.12*/{_display_(Seq[Any](format.raw/*18.13*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*19.71*/routes/*19.77*/.Assets.at("images/profile_holder.png"))),format.raw/*19.116*/("""" />
        """)))})),format.raw/*20.10*/("""
        """),_display_(Seq[Any](/*21.10*/helper/*21.16*/.inputFile(user("profilePicture"), 'class -> "form-control", '_label -> "Upload/Change your profile image" ))),format.raw/*21.124*/("""

    </div>
    <div class="col-xs-1 column">
    </div>
		<div class="col-xs-6 column" style="margin-top: 40px; background-color: #FFFFFF;">
				<div class="form-group break-after">
					 """),_display_(Seq[Any](/*28.8*/helper/*28.14*/.inputText(user("userName"), 'class -> "form-control", '_label -> "Name" ))),format.raw/*28.88*/("""
           """),_display_(Seq[Any](/*29.13*/helper/*29.19*/.inputText(user("email"), 'class -> "form-control", '_label -> "Email Address", 'readonly -> "readonly" ))),format.raw/*29.124*/("""
           """),_display_(Seq[Any](/*30.13*/if(userModel.password == null || userModel.password == "")/*30.71*/{_display_(Seq[Any](format.raw/*30.72*/("""
             """),_display_(Seq[Any](/*31.15*/helper/*31.21*/.inputText(user("password"), 'class -> "form-control", '_label -> "Password", 'type -> "password"))),format.raw/*31.119*/("""
         """)))}/*32.11*/else/*32.15*/{_display_(Seq[Any](format.raw/*32.16*/("""
             """),_display_(Seq[Any](/*33.15*/helper/*33.21*/.inputText(user("password"), 'class -> "form-control", '_label -> "Password",'type -> "password", 'readonly -> "readonly"))),format.raw/*33.143*/("""
         """)))})),format.raw/*34.11*/("""
           """),_display_(Seq[Any](/*35.13*/helper/*35.19*/.inputText(user("headline"), 'class -> "form-control", '_label -> "Personal Headline" ))),format.raw/*35.106*/("""
           """),_display_(Seq[Any](/*36.13*/helper/*36.19*/.inputText(user("location"), 'class -> "form-control", '_label -> "Location" ))),format.raw/*36.97*/("""
           """),_display_(Seq[Any](/*37.13*/helper/*37.19*/.inputText(user("currentEmployer"), 'class -> "form-control", '_label -> "Current Employer" ))),format.raw/*37.112*/("""
           """),_display_(Seq[Any](/*38.13*/helper/*38.19*/.inputText(user("recentSchool"), 'class -> "form-control", '_label -> "University or Institution" ))),format.raw/*38.118*/("""
           """),_display_(Seq[Any](/*39.13*/helper/*39.19*/.checkbox(user("isPremium"), '_label -> "Check here for premium users"))),format.raw/*39.90*/("""
           """),_display_(Seq[Any](/*40.13*/helper/*40.19*/.inputText(user("creditCard"), 'class -> "form-control", '_label -> "Credit Card Number"))),format.raw/*40.108*/("""
           <p>Required for Recruiters - $20 Monthly Fee</p>

				</div>

		</div>
    <div class="col-xs-2 column"></div>
	</div>
	<div class="row clearfix">
    <div class="col-xs-2 column logo-img"></div>
		<div class="col-xs-8 column" style="background-color: #FFFFFF;">
          <div class="break-after">
            """),_display_(Seq[Any](/*52.14*/helper/*52.20*/.textarea(user("aboutMe"), 'class -> "form-control", '_label -> "About Me", 'rows -> "4" ))),format.raw/*52.110*/("""
          </div>
          <div class="break-after">
            """),_display_(Seq[Any](/*55.14*/helper/*55.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "Experience", 'rows -> "4" ))),format.raw/*55.115*/("""

          </div>
          <div class="break-after">
              """),_display_(Seq[Any](/*59.16*/helper/*59.22*/.textarea(user("projects"), 'class -> "form-control", '_label -> "Projects Or Skills Highlight", 'rows -> "4" ))),format.raw/*59.133*/("""

            </div>
            <div class="break-after">
                """),_display_(Seq[Any](/*63.18*/helper/*63.24*/.textarea(user("education"), 'class -> "form-control", '_label -> "Education", 'rows -> "4" ))),format.raw/*63.117*/("""

          </div>
          <button type="submit" class="btn save-button pull-right" style="margin-bottom: 15px;">Submit</button>
        </div>
      </div>
      <div class="col-xs-2 column bottom-div"></div>
    """)))})),format.raw/*70.6*/("""
		</div>
""")))})),format.raw/*72.2*/("""
"""))}
    }
    
    def render(user:Form[UserModel],userModel:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user,userModel)
    
    def f:((Form[UserModel],UserModel) => play.api.templates.HtmlFormat.Appendable) = (user,userModel) => apply(user,userModel)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 14:00:32 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: bd45e9a7adf78da9949ba613c54e172fe758d9da
                    MATRIX: 799->1|955->46|985->68|1022->71|1048->89|1086->90|1125->95|1139->101|1167->108|1236->142|1250->148|1312->189|1418->260|1433->266|1521->345|1560->346|1658->409|1703->445|1742->446|1836->504|1851->510|1918->554|1949->567|1962->571|2001->572|2109->644|2124->650|2186->689|2233->704|2280->715|2295->721|2426->829|2659->1027|2674->1033|2770->1107|2820->1121|2835->1127|2963->1232|3013->1246|3080->1304|3119->1305|3171->1321|3186->1327|3307->1425|3338->1437|3351->1441|3390->1442|3442->1458|3457->1464|3602->1586|3646->1598|3696->1612|3711->1618|3821->1705|3871->1719|3886->1725|3986->1803|4036->1817|4051->1823|4167->1916|4217->1930|4232->1936|4354->2035|4404->2049|4419->2055|4512->2126|4562->2140|4577->2146|4689->2235|5061->2571|5076->2577|5189->2667|5295->2737|5310->2743|5428->2838|5538->2912|5553->2918|5687->3029|5803->3109|5818->3115|5934->3208|6189->3432|6233->3445
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|40->12|40->12|40->12|40->12|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|80->52|80->52|80->52|83->55|83->55|83->55|87->59|87->59|87->59|91->63|91->63|91->63|98->70|100->72
                    -- GENERATED --
                */
            