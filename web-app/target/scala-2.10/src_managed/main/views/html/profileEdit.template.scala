
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
object profileEdit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[FeedItem],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(feedItems: List[FeedItem], user:User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("ProConect")/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
"""),_display_(Seq[Any](/*7.2*/navbar/*7.8*/.render)),format.raw/*7.15*/("""

<link rel="stylesheet" href=""""),_display_(Seq[Any](/*9.31*/routes/*9.37*/.Assets.at("stylesheets/editProfile.min.css"))),format.raw/*9.82*/("""">

<div class="container">
  <div class="row clearfix">
    <div class="col-md-3 column">
      <img alt="140x140" src=""""),_display_(Seq[Any](/*14.32*/routes/*14.38*/.Assets.at("images/profile_holder.png"))),format.raw/*14.77*/("""" /><br /><br /><br />
      <a href=""""),_display_(Seq[Any](/*15.17*/routes/*15.23*/.DbController.profileMain())),format.raw/*15.50*/("""">
      <button type="button" class="btn btn-default">Edit Profile</button>
    </a>
    </div>
    <div class="col-md-6 column">
      <h3>
        Name
      </h3>
      <h3>
        Personal Headline
      </h3>
      <h3>
        Current Employer
      </h3>
      <h3>
        Location
      </h3>
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
""")))})),format.raw/*87.2*/("""
"""))}
    }
    
    def render(feedItems:List[FeedItem],user:User): play.api.templates.HtmlFormat.Appendable = apply(feedItems,user)
    
    def f:((List[FeedItem],User) => play.api.templates.HtmlFormat.Appendable) = (feedItems,user) => apply(feedItems,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 22 21:33:16 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: f8033578c28218eb7660194f4060b431747b4603
                    MATRIX: 793->1|941->39|969->58|1006->61|1031->78|1069->79|1105->81|1118->87|1146->94|1213->126|1227->132|1293->177|1451->299|1466->305|1527->344|1602->383|1617->389|1666->416|3885->2604
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|37->9|37->9|37->9|42->14|42->14|42->14|43->15|43->15|43->15|115->87
                    -- GENERATED --
                */
            