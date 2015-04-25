
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
object profileEdit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.13*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("ProConect")/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
"""),_display_(Seq[Any](/*7.2*/navbar/*7.8*/.render)),format.raw/*7.15*/("""

<link rel="stylesheet" href=""""),_display_(Seq[Any](/*9.31*/routes/*9.37*/.Assets.at("stylesheets/editProfile.min.css"))),format.raw/*9.82*/("""">

<div class="container">
  <div class="row clearfix">
    <div class="col-md-3 column">
      """),_display_(Seq[Any](/*14.8*/if(user.profilePicture != null)/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""

        """)))}/*16.10*/else/*16.14*/{_display_(Seq[Any](format.raw/*16.15*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/("""" />
        """)))})),format.raw/*18.10*/("""
        <a href=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.DbController.profileMain())),format.raw/*19.52*/("""">
      <button type="button" class="btn btn-default">Edit Profile</button>
    </a>
    </div>
    <div class="col-md-6 column">
      """),_display_(Seq[Any](/*24.8*/if(user.userName != null)/*24.33*/{_display_(Seq[Any](format.raw/*24.34*/("""
            <h3>"""),_display_(Seq[Any](/*25.18*/user/*25.22*/.userName)),format.raw/*25.31*/("""</h3>
          """)))}/*26.12*/else/*26.16*/{_display_(Seq[Any](format.raw/*26.17*/("""
            <h3>Guest</h3>
          """)))})),format.raw/*28.12*/("""

        """),_display_(Seq[Any](/*30.10*/if(user.aboutMe != null)/*30.34*/{_display_(Seq[Any](format.raw/*30.35*/("""
          <h3>"""),_display_(Seq[Any](/*31.16*/user/*31.20*/.aboutMe)),format.raw/*31.28*/("""</h3>
        """)))})),format.raw/*32.10*/("""

      """),_display_(Seq[Any](/*34.8*/if(user.currentEmployer != null)/*34.40*/{_display_(Seq[Any](format.raw/*34.41*/("""
          <h3>"""),_display_(Seq[Any](/*35.16*/user/*35.20*/.currentEmployer)),format.raw/*35.36*/("""</h3>
        """)))})),format.raw/*36.10*/("""

      """),_display_(Seq[Any](/*38.8*/if(user.location != null)/*38.33*/{_display_(Seq[Any](format.raw/*38.34*/("""
          <h3>"""),_display_(Seq[Any](/*39.16*/user/*39.20*/.location)),format.raw/*39.29*/("""</h3>
        """)))})),format.raw/*40.10*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-12 column">
      <h2>
        About Me
      </h2>
      <p>
        Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
      </p>
      <p>
        <a class="btn" href="#">Edit About Me »</a>
      </p>
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-12 column">
      <h2>
        Experience
      </h2>
      <p>
        Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
      </p>
      <p>
        <a class="btn" href="#">Edit Experience »</a>
      </p>
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-12 column">
      <h2>
        Projects or Skills Highlight
      </h2>
      <p>
        Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
      </p>
      <p>
        <a class="btn" href="#">Edit Skills »</a>
      </p>
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-12 column">
      <h2>
        Education
      </h2>
      <p>
        Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
      </p>
      <p>
        <a class="btn" href="#">Edit Education »</a>
      </p>
    </div>
  </div>
</div>
""")))})),format.raw/*96.2*/("""
"""))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 24 19:15:47 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 21eec5cc715c909c5c915727321d1738cb25fb46
                    MATRIX: 778->1|899->12|927->31|964->34|989->51|1027->52|1063->54|1076->60|1104->67|1171->99|1185->105|1251->150|1384->248|1424->279|1463->280|1493->291|1506->295|1545->296|1652->367|1667->373|1729->412|1775->426|1830->445|1845->451|1894->478|2067->616|2101->641|2140->642|2194->660|2207->664|2238->673|2274->690|2287->694|2326->695|2397->734|2444->745|2477->769|2516->770|2568->786|2581->790|2611->798|2658->813|2702->822|2743->854|2782->855|2834->871|2847->875|2885->891|2932->906|2976->915|3010->940|3049->941|3101->957|3114->961|3145->970|3192->985|5108->2870
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|37->9|37->9|37->9|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|56->28|58->30|58->30|58->30|59->31|59->31|59->31|60->32|62->34|62->34|62->34|63->35|63->35|63->35|64->36|66->38|66->38|66->38|67->39|67->39|67->39|68->40|124->96
                    -- GENERATED --
                */
            