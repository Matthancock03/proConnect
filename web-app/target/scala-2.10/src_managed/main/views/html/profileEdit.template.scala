
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
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("ProConnect")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
  """),_display_(Seq[Any](/*4.4*/navbar/*4.10*/.render)),format.raw/*4.17*/("""
  <link rel="stylesheet" href=""""),_display_(Seq[Any](/*5.33*/routes/*5.39*/.Assets.at("stylesheets/editProfile.min.css"))),format.raw/*5.84*/("""">

<div class="container-fluid">
	<div class="row clearfix">
		<div class="col-xs-2 column logo-img img-div">
			<img alt="140x140" class="img-rounded"src="http://lorempixel.com/140/140/" />
      <label for="exampleInputFile">Profile Image</label><input type="file" id="exampleInputFile" />
		</div>
    <div class="col-xs-2 column">
    </div>
		<div class="col-xs-6 column">
      """),_display_(Seq[Any](/*16.8*/helper/*16.14*/.form(action = routes.DbController.home)/*16.54*/{_display_(Seq[Any](format.raw/*16.55*/("""
				<div class="form-group break-after">
					 <label class="spacer">Name</label><input type="text" class="form-control" id="exampleInputEmail1" />
					 <label class="spacer-min">Personal Headline</label><input type="text"  class="form-control" id="exampleInputPassword1" />
           <label class="spacer-min">Location</label><input type="text"  class="form-control" id="exampleInputPassword1" />
           <label class="spacer-min">Current Employer</label><input type="text"  class="form-control" id="exampleInputPassword1" />
				</div>

		</div>
    <div class="col-xs-2 column"></div>
	</div>
	<div class="row clearfix">
    <div class="col-xs-2 column logo-img"></div>
		<div class="col-xs-8 column">
          <div class="break-after">
          <label class="spacer" for="comment">About Me:</label>
            <textarea class="form-control" rows="4" id="comment"></textarea>
          </div>
          <div class="break-after">
          <label class="spacer" for="comment">Experience:</label>
            <textarea class="form-control" rows="4" id="comment"></textarea>
          </div>
          <div class="break-after">
          <label class="spacer" for="comment">Projects Or Skills Highlight:</label>
              <textarea class="form-control" rows="4" id="comment"></textarea>
            </div>
            <div class="break-after">
          <label class="spacer" for="comment">Education:</label>
                <textarea class="form-control" rows="4" id="comment"></textarea>
          </div>
          <button type="submit" class="btn save-button">Submit</button>
    </div>
      </div>
      <div class="col-xs-2 column bottom-div"></div>
    """)))})),format.raw/*50.6*/("""
		</div>
""")))})),format.raw/*52.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 01 21:03:00 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 52631aea2d63765d96188ebacf859f986f639b7f
                    MATRIX: 877->17|913->19|939->37|977->38|1015->42|1029->48|1057->55|1125->88|1139->94|1205->139|1626->525|1641->531|1690->571|1729->572|3434->2246|3476->2257
                    LINES: 30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|44->16|44->16|44->16|44->16|78->50|80->52
                    -- GENERATED --
                */
            