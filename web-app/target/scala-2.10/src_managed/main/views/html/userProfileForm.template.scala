
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
object userProfileForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.5*/("""<div class="form-group break-after">
					 <label class="spacer">Name</label>
           <input type="text" class="form-control" id="exampleInputEmail1" />
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
      <div class="col-xs-2 column bottom-div"></div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 24 15:52:41 PDT 2015
                    SOURCE: /home/beyondprosthetics/repos/school/proConnect/web-app/app/views/userProfileForm.scala.html
                    HASH: 5cf7e39be25c47f7882616e9ef8abcfbfc16592f
                    MATRIX: 865->4
                    LINES: 29->1
                    -- GENERATED --
                */
            