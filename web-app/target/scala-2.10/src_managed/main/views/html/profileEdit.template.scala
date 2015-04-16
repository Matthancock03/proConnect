
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
            <div>
            <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
              <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
            </button>
            <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
              <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
            </button>
          </div>
          </div>
          <div class="break-after">
          <label class="spacer" for="comment">Projects Or Skills Highlight:</label>
              <textarea class="form-control" rows="4" id="comment"></textarea>
              <div>
              <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
              </button>
              <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
              </button>
            </div>
            </div>
            <div class="break-after">
              <label class="spacer" for="comment">Education:</label>
                <textarea class="form-control" rows="4" id="comment"></textarea>
                <div>
                <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                </button>
                <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                </button>
              </div>
          </div>
          <button type="submit" class="btn save-button">Submit</button>
    </div>
      </div>
      <div class="col-xs-2 column bottom-div"></div>
    """)))})),format.raw/*74.6*/("""
		</div>
""")))})),format.raw/*76.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 15 15:59:00 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 806eda70b428660e27fe54d459f68663624f1950
                    MATRIX: 878->18|915->21|941->39|979->40|1018->45|1032->51|1060->58|1129->92|1143->98|1209->143|1641->540|1656->546|1705->586|1744->587|4813->3625|4857->3638
                    LINES: 30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|44->16|44->16|44->16|44->16|102->74|104->76
                    -- GENERATED --
                */
            