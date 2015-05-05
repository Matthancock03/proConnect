
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

<link rel="stylesheet" href=""""),_display_(Seq[Any](/*8.31*/routes/*8.37*/.Assets.at("stylesheets/editProfile.min.css"))),format.raw/*8.82*/("""">

<div class="container-fluid">
	<div class="row clearfix">
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.DbController.saveUser, 'enctype -> "multipart/form-data")/*12.91*/{_display_(Seq[Any](format.raw/*12.92*/("""

		<div class="col-xs-2 column logo-img img-div">

      """),_display_(Seq[Any](/*16.8*/if(userModel.profilePicture != null)/*16.44*/{_display_(Seq[Any](format.raw/*16.45*/("""
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.57*/routes/*17.63*/.DbController.getProfilePic(userModel.email))),format.raw/*17.107*/("""" />
      """)))}/*18.8*/else/*18.12*/{_display_(Seq[Any](format.raw/*18.13*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*19.71*/routes/*19.77*/.Assets.at("images/profile_holder.png"))),format.raw/*19.116*/("""" />
        """)))})),format.raw/*20.10*/("""
        """),_display_(Seq[Any](/*21.10*/helper/*21.16*/.inputFile(user("profilePicture"), 'class -> "form-control", '_label -> "Upload/Change your profile image" ))),format.raw/*21.124*/("""

    </div>
    <div class="col-xs-2 column">
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
            <div>
              <button type="button" class="btn btn-info pull-right btn-xs" aria-label="left Align">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
              </button>
            <button type="button" class="btn btn-danger pull-right btn-xs" aria-label="left Align">
              <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
            </button>
          </div>
          </div>
          <div class="break-after">
              """),_display_(Seq[Any](/*66.16*/helper/*66.22*/.textarea(user("projects"), 'class -> "form-control", '_label -> "Projects Or Skills Highlight", 'rows -> "4" ))),format.raw/*66.133*/("""
              <div>
                <button type="button" class="btn btn-info btn-xs pull-right" aria-label="right Align">
                  <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                </button>
                <button type="button" class="btn btn-danger btn-xs pull-right" aria-label="right Align">
                  <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                </button>

              </div>
            </div>
            <div class="break-after">
                """),_display_(Seq[Any](/*78.18*/helper/*78.24*/.textarea(user("education"), 'class -> "form-control", '_label -> "Education", 'rows -> "4" ))),format.raw/*78.117*/("""
                <div>
                  <button type="button" class="btn btn-info pull-right btn-xs" aria-label="left Align">
                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                  </button>
                <button type="button" class="btn btn-danger pull-right  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                </button>

              </div>
          </div>
          <button type="submit" class="btn save-button pull-right">Submit</button>
        </div>
      </div>
      <div class="col-xs-2 column bottom-div"></div>
    """)))})),format.raw/*93.6*/("""
		</div>
""")))})),format.raw/*95.2*/("""
"""))}
    }
    
    def render(user:Form[UserModel],userModel:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user,userModel)
    
    def f:((Form[UserModel],UserModel) => play.api.templates.HtmlFormat.Appendable) = (user,userModel) => apply(user,userModel)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
<<<<<<< HEAD
                    DATE: Mon May 04 13:38:52 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: 4dba66d282a63cdd8902124990e628f532d381c2
                    MATRIX: 799->1|955->46|985->68|1022->71|1048->89|1086->90|1125->95|1139->101|1167->108|1236->142|1250->148|1316->193|1422->264|1437->270|1525->349|1564->350|1662->413|1707->449|1746->450|1840->508|1855->514|1922->558|1953->571|1966->575|2005->576|2113->648|2128->654|2190->693|2237->708|2284->719|2299->725|2430->833|2663->1031|2678->1037|2774->1111|2824->1125|2839->1131|2967->1236|3017->1250|3084->1308|3123->1309|3175->1325|3190->1331|3311->1429|3342->1441|3355->1445|3394->1446|3446->1462|3461->1468|3606->1590|3650->1602|3700->1616|3715->1622|3824->1708|3874->1722|3889->1728|3989->1806|4039->1820|4054->1826|4170->1919|4222->1935|4237->1941|4330->2012|4380->2026|4395->2032|4507->2121|4879->2457|4894->2463|5010->2556|5116->2626|5131->2632|5249->2727|5809->3251|5824->3257|5958->3368|6552->3926|6567->3932|6683->4025|7394->4705|7438->4718
=======
                    DATE: Mon May 04 17:10:29 PDT 2015
=======
                    DATE: Mon May 04 19:44:30 PDT 2015
>>>>>>> b3a22e47a1a7935bbebab4765ffc738bee4e6801
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: b145b663f4e0892d04426c7a3ba03c5cff6c9149
                    MATRIX: 799->1|954->46|982->65|1018->67|1044->85|1082->86|1120->90|1134->96|1162->103|1229->135|1243->141|1309->186|1411->253|1426->259|1514->338|1553->339|1647->398|1692->434|1731->435|1824->492|1839->498|1906->542|1936->554|1949->558|1988->559|2095->630|2110->636|2172->675|2218->689|2264->699|2279->705|2410->813|2636->1004|2651->1010|2747->1084|2796->1097|2811->1103|2939->1208|2988->1221|3055->1279|3094->1280|3145->1295|3160->1301|3281->1399|3311->1410|3324->1414|3363->1415|3414->1430|3429->1436|3574->1558|3617->1569|3666->1582|3681->1588|3791->1675|3840->1688|3855->1694|3955->1772|4004->1785|4019->1791|4135->1884|4185->1898|4200->1904|4293->1975|4342->1988|4357->1994|4469->2083|4829->2407|4844->2413|4957->2503|5060->2570|5075->2576|5193->2671|5742->3184|5757->3190|5891->3301|6473->3847|6488->3853|6604->3946|7300->4611|7342->4622
>>>>>>> 2b258ea4a556f051de588edae1086775e04850b4
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|40->12|40->12|40->12|40->12|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|67->39|67->39|67->39|68->40|68->40|68->40|80->52|80->52|80->52|83->55|83->55|83->55|94->66|94->66|94->66|106->78|106->78|106->78|121->93|123->95
                    -- GENERATED --
                */
            