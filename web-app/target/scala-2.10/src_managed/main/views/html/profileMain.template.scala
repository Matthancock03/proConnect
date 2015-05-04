
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
		<div class="col-xs-6 column" style="margin-top: 40px;">
				<div class="form-group break-after">
					 """),_display_(Seq[Any](/*28.8*/helper/*28.14*/.inputText(user("userName"), 'class -> "form-control", '_label -> "Name" ))),format.raw/*28.88*/("""
           """),_display_(Seq[Any](/*29.13*/helper/*29.19*/.inputText(user("email"), 'class -> "form-control", '_label -> "Email Address", 'readonly -> "readonly" ))),format.raw/*29.124*/("""
           """),_display_(Seq[Any](/*30.13*/if(userModel.password == null || userModel.password == "")/*30.71*/{_display_(Seq[Any](format.raw/*30.72*/("""
             """),_display_(Seq[Any](/*31.15*/helper/*31.21*/.inputText(user("password"), 'class -> "form-control", '_label -> "Password", 'type -> "password"))),format.raw/*31.119*/("""
         """)))}/*32.11*/else/*32.15*/{_display_(Seq[Any](format.raw/*32.16*/("""
             """),_display_(Seq[Any](/*33.15*/helper/*33.21*/.inputText(user("password"), 'class -> "form-control", '_label -> "Password",'type -> "password", 'readonly -> "readonly"))),format.raw/*33.143*/("""
         """)))})),format.raw/*34.11*/("""
           """),_display_(Seq[Any](/*35.13*/helper/*35.19*/.inputText(user("aboutMe"), 'class -> "form-control", '_label -> "Personal Headline" ))),format.raw/*35.105*/("""
           """),_display_(Seq[Any](/*36.13*/helper/*36.19*/.inputText(user("location"), 'class -> "form-control", '_label -> "Location" ))),format.raw/*36.97*/("""
           """),_display_(Seq[Any](/*37.13*/helper/*37.19*/.inputText(user("currentEmployer"), 'class -> "form-control", '_label -> "Current Employer" ))),format.raw/*37.112*/("""
<<<<<<< HEAD
           """),_display_(Seq[Any](/*38.13*/helper/*38.19*/.checkbox(user("isPremium"), '_label -> "Check here for premium users"))),format.raw/*38.90*/("""
           """),_display_(Seq[Any](/*39.13*/helper/*39.19*/.inputText(user("creditCard"), 'class -> "form-control", '_label -> "Credit Card Number (Required for Recruiters)"))),format.raw/*39.134*/("""
=======
           """),_display_(Seq[Any](/*38.13*/helper/*38.19*/.inputText(user("currentEmployer"), 'class -> "form-control", '_label -> "Credit Card Number"))),format.raw/*38.113*/("""
           <p>Required for Recruiters - $20 Monthly Fee</p>
>>>>>>> f5d7bb961f10beffc7185a311b322c15f074366a
				</div>

		</div>
    <div class="col-xs-2 column"></div>
	</div>
	<div class="row clearfix">
    <div class="col-xs-2 column logo-img"></div>
		<div class="col-xs-8 column">
          <div class="break-after">
            """),_display_(Seq[Any](/*49.14*/helper/*49.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "About Me", 'rows -> "4" ))),format.raw/*49.113*/("""
          </div>
          <div class="break-after">
            """),_display_(Seq[Any](/*52.14*/helper/*52.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "Experience", 'rows -> "4" ))),format.raw/*52.115*/("""
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
              """),_display_(Seq[Any](/*63.16*/helper/*63.22*/.textarea(user("projects"), 'class -> "form-control", '_label -> "Projects Or Skills Highlight", 'rows -> "4" ))),format.raw/*63.133*/("""
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
                """),_display_(Seq[Any](/*75.18*/helper/*75.24*/.textarea(user("education"), 'class -> "form-control", '_label -> "Education", 'rows -> "4" ))),format.raw/*75.117*/("""
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
    """)))})),format.raw/*90.6*/("""
		</div>
""")))})),format.raw/*92.2*/("""
"""))}
    }
    
    def render(user:Form[UserModel],userModel:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user,userModel)
    
    def f:((Form[UserModel],UserModel) => play.api.templates.HtmlFormat.Appendable) = (user,userModel) => apply(user,userModel)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Sun May 03 23:17:09 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: d728536e141cf3087d74e28cb84ac57079190cab
                    MATRIX: 799->1|954->46|982->65|1018->67|1044->85|1082->86|1120->90|1134->96|1162->103|1229->135|1243->141|1309->186|1411->253|1426->259|1514->338|1553->339|1647->398|1692->434|1731->435|1824->492|1839->498|1906->542|1936->554|1949->558|1988->559|2095->630|2110->636|2172->675|2218->689|2264->699|2279->705|2410->813|2609->977|2624->983|2720->1057|2769->1070|2784->1076|2912->1181|2961->1194|3028->1252|3067->1253|3118->1268|3133->1274|3254->1372|3284->1383|3297->1387|3336->1388|3387->1403|3402->1409|3547->1531|3590->1542|3639->1555|3654->1561|3763->1647|3812->1660|3827->1666|3927->1744|3976->1757|3991->1763|4107->1856|4156->1869|4171->1875|4264->1946|4313->1959|4328->1965|4466->2080|4730->2308|4745->2314|4861->2407|4964->2474|4979->2480|5097->2575|5646->3088|5661->3094|5795->3205|6377->3751|6392->3757|6508->3850|7204->4515|7246->4526
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|40->12|40->12|40->12|40->12|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|77->49|77->49|77->49|80->52|80->52|80->52|91->63|91->63|91->63|103->75|103->75|103->75|118->90|120->92
=======
                    DATE: Sun May 03 21:43:45 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: d5c1bd4bf464ad8689236115a8f4a076200888ff
                    MATRIX: 799->1|955->46|985->68|1022->71|1048->89|1086->90|1125->95|1139->101|1167->108|1236->142|1250->148|1316->193|1422->264|1437->270|1525->349|1564->350|1662->413|1707->449|1746->450|1840->508|1855->514|1922->558|1953->571|1966->575|2005->576|2113->648|2128->654|2190->693|2237->708|2284->719|2299->725|2430->833|2636->1004|2651->1010|2747->1084|2797->1098|2812->1104|2940->1209|2990->1223|3057->1281|3096->1282|3148->1298|3163->1304|3284->1402|3315->1414|3328->1418|3367->1419|3419->1435|3434->1441|3579->1563|3623->1575|3673->1589|3688->1595|3797->1681|3847->1695|3862->1701|3962->1779|4012->1793|4027->1799|4143->1892|4193->1906|4208->1912|4325->2006|4660->2305|4675->2311|4791->2404|4897->2474|4912->2480|5030->2575|5590->3099|5605->3105|5739->3216|6333->3774|6348->3780|6464->3873|7175->4553
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|40->12|40->12|40->12|40->12|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|77->49|77->49|77->49|80->52|80->52|80->52|91->63|91->63|91->63|103->75|103->75|103->75|118->90
>>>>>>> f5d7bb961f10beffc7185a311b322c15f074366a
                    -- GENERATED --
                */
            