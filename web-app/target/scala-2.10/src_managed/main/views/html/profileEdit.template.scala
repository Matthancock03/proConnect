
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
object profileEdit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("ProConect")/*1.19*/{_display_(Seq[Any](format.raw/*1.20*/("""
"""),_display_(Seq[Any](/*2.2*/navbar/*2.8*/.render)),format.raw/*2.15*/("""

<link rel="stylesheet" href=""""),_display_(Seq[Any](/*4.31*/routes/*4.37*/.Assets.at("stylesheets/editProfile.min.css"))),format.raw/*4.82*/("""">

<div class="container">
  <div class="row clearfix">
    <div class="col-md-3 column">
      <img alt="140x140" src=""""),_display_(Seq[Any](/*9.32*/routes/*9.38*/.Assets.at("images/profile_holder.png"))),format.raw/*9.77*/("""" /><br /><br /><br />
      <a href=""""),_display_(Seq[Any](/*10.17*/routes/*10.23*/.DbController.profileMain())),format.raw/*10.50*/("""">
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
""")))})),format.raw/*82.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 22 17:31:03 PDT 2015
                    SOURCE: /home/beyondprosthetics/repos/school/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 77e0d2852fdd1b40005cf697720c2279869caef7
                    MATRIX: 870->1|895->18|933->19|969->21|982->27|1010->34|1077->66|1091->72|1157->117|1314->239|1328->245|1388->284|1463->323|1478->329|1527->356|3746->2544
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|32->4|32->4|32->4|37->9|37->9|37->9|38->10|38->10|38->10|110->82
                    -- GENERATED --
                */
            