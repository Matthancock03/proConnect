
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
object message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ProConect")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
"""),_display_(Seq[Any](/*6.2*/navbar/*6.8*/.render)),format.raw/*6.15*/("""
<div class="container">
	<div class="row clearfix">
		<div class="col-xs-12 column">
			<div class="page-header">
				<h1>
					Messages
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-xs-2 column">

			<div class="btn-group btn-group-vertical btn-group-md">
			<br /><br /><br />
			 <button type="button" class="btn btn-success">Compose</button>
			 <br />
				 <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em> Inbox</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-center"></em> Sent</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-right"></em> Trash</button> <
			</div>
		</div>
		<div class="col-xs-6 column">

			<table class="table table-condensed" style="background-color: #FFFFFF;">
				<thead>
					<tr>
						<th>
							#
						</th>
						<th>
							Message
						</th>
						<th>
							Date
						</th>
						<th>
							Status
						</th>
						<th>

						</th>
					</tr>
				</thead>
				<tbody>

					"""),_display_(Seq[Any](/*51.7*/for((message, index) <- messages.zipWithIndex) yield /*51.53*/{_display_(Seq[Any](format.raw/*51.54*/("""
					<tr>
						<td>
							"""),_display_(Seq[Any](/*54.9*/{index + 1})),format.raw/*54.20*/("""
						</td>
						<td>
							<a data-toggle="collapse" data-target="#"""),_display_(Seq[Any](/*57.49*/index)),format.raw/*57.54*/("""">"""),_display_(Seq[Any](/*57.57*/message/*57.64*/.messageTitle)),format.raw/*57.77*/("""</a>
						</td>
						<td>
							"""),_display_(Seq[Any](/*60.9*/message/*60.16*/.tstamp)),format.raw/*60.23*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*63.9*/if(message.isRead)/*63.27*/{_display_(Seq[Any](format.raw/*63.28*/("""
								Read
							""")))}/*65.9*/else/*65.13*/{_display_(Seq[Any](format.raw/*65.14*/("""
								Unread
							""")))})),format.raw/*67.9*/("""
						</td>
					</tr>

					<tr id=""""),_display_(Seq[Any](/*71.15*/index)),format.raw/*71.20*/("""" class="collapse">
						<td>#</td>
						<td colspan="3">"""),_display_(Seq[Any](/*73.24*/message/*73.31*/.messageBody)),format.raw/*73.43*/("""</td>
						<td>
							<a href="#" ><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target=".bs-example-modal-lg"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button></a>
							<a href="#" ><span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></a>
						</td>
					</tr>

				""")))})),format.raw/*80.6*/("""
				</tbody>
			</table>

			<!-- Large modal -->

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*90.12*/form(routes.UserController.replyMessage())/*90.54*/{_display_(Seq[Any](format.raw/*90.55*/("""

          	<div class="form-group" style="width: 50%; margin: 0 auto;">
            <div style="width: 75%; margin: 0 auto;">
          		<h2 class="form-signin-heading">Message</h2>
          			<input class="form-control"
          					placeholder="Message Title"
          					type="text"
          					name="messageTitle"
          					id="messageTitle"
          					value=""
          				/>
          			<input class="form-control"
          					placeholder="Message"
          					type="text"
          					name="messageBody"
          					id="messageBody"
          					value=""
          				/>
									<input class="form-control"
            					placeholder="User Id"
            					type="text"
            					name="id"
            					id="id"
            					value=""
                      style="display: none;"
            				/>
          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*120.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->

		</div>
	</div>
	<div class="row clearfix">
		<div class="col-xs-4 column">
		</div>
		<div class="col-xs-8 column">
			<ul class="pagination">
				<li>
					<a href="#">Prev</a>
				</li>
				<li>
					<a href="#">1</a>
				</li>
				<li>
					<a href="#">2</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">4</a>
				</li>
				<li>
					<a href="#">5</a>
				</li>
				<li>
					<a href="#">Next</a>
				</li>
			</ul>
		</div>
	</div>
</div>
""")))})),format.raw/*157.2*/("""
"""))}
    }
    
    def render(messages:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(messages)
    
    def f:((List[Message]) => play.api.templates.HtmlFormat.Appendable) = (messages) => apply(messages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 13:16:14 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/message.scala.html
                    HASH: 50c08b94f0b153261ca0a5c13b2b89bc38e5da9d
                    MATRIX: 783->1|918->26|946->45|982->47|1007->64|1045->65|1081->67|1094->73|1122->80|2250->1173|2312->1219|2351->1220|2416->1250|2449->1261|2557->1333|2584->1338|2623->1341|2639->1348|2674->1361|2745->1397|2761->1404|2790->1411|2857->1443|2884->1461|2923->1462|2963->1484|2976->1488|3015->1489|3070->1513|3145->1552|3172->1557|3268->1617|3284->1624|3318->1636|3703->1990|4007->2258|4058->2300|4097->2301|5158->3329|5723->3862
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|79->51|79->51|79->51|82->54|82->54|85->57|85->57|85->57|85->57|85->57|88->60|88->60|88->60|91->63|91->63|91->63|93->65|93->65|93->65|95->67|99->71|99->71|101->73|101->73|101->73|108->80|118->90|118->90|118->90|148->120|185->157
                    -- GENERATED --
                */
            