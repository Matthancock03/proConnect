
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
object navbar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href=""""),_display_(Seq[Any](/*12.38*/routes/*12.44*/.DbController.home())),format.raw/*12.64*/("""">Proconnect</a>
    </div>

  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li><a href=""""),_display_(Seq[Any](/*18.21*/routes/*18.27*/.DbController.home())),format.raw/*18.47*/("""">Home</a></li>
      <li><a href=""""),_display_(Seq[Any](/*19.21*/routes/*19.27*/.DbController.editProfile())),format.raw/*19.54*/("""">Profile</a></li>
      <li><a href=""""),_display_(Seq[Any](/*20.21*/routes/*20.27*/.Application.connections())),format.raw/*20.53*/("""">Connections</a></li>
      <li><a href=""""),_display_(Seq[Any](/*21.21*/routes/*21.27*/.Application.forum())),format.raw/*21.47*/("""">Forums</a></li>
    </ul>
    <form class="navbar-form navbar-left" role="search">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">My Account<span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#">Action</a></li>
          <li><a href="#">Another action</a></li>
          <li><a href="#">Something else here</a></li>
          <li class="divider"></li>
          <li><a href="#">Separated link</a></li>
        </ul>
      </li>
    </ul>
  </div><!-- /.navbar-collapse -->
</div><!-- /.container-fluid -->
</nav>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 01 21:03:00 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/navbar.scala.html
                    HASH: 3ab63cd898705d514e1173d55f67f175021e8ae5
                    MATRIX: 856->1|1413->522|1428->528|1470->548|1734->776|1749->782|1791->802|1863->838|1878->844|1927->871|2002->910|2017->916|2065->942|2144->985|2159->991|2201->1011
                    LINES: 29->2|39->12|39->12|39->12|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21
                    -- GENERATED --
                */
            