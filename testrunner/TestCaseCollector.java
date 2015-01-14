<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html id="html">
    <head>
        <title>GC: TestCaseCollector - com.android.uiautomator.testrunner.TestCaseCollector (.java) - GrepCode Class Source</title>
        <meta name="verify-v1" content="oDbHfknRLVnvs+1b/O61iSxPEhVr3O08Fd3QqJ1cGh8="/>
        <meta name="verify-v1" content="d2G+nnw2Xr6jBfde7yNvdZirW9Y6K0fa+56zhEmm6YA="/>
        <meta name="msvalidate.01" content="62B5A32F828BC27E3852FB825A5156E4" />
        <meta name="description" content="com.android.uiautomator.testrunner.TestCaseCollector"/>
        <meta property="fb:app_id" content="143989634057"/>
        <link rel="canonical" href="http://grepcode.com/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java?av=f"/>
        <link rel="search" type="application/opensearchdescription+xml" title="grepcode.com" href="/static/app/grepcodeosd.xml"/>
        <link rel="icon" type="image/x-icon" href="/static/app/images/favicon.ico"/>

        <link href="/static/app/stylesheet/site.css" rel="stylesheet" type="text/css"/>
        <link href="/static/app/stylesheet/images-sprite.css" rel="stylesheet" type="text/css"/>
        <link href="/static/app/stylesheet/images-site-sprite.css" rel="stylesheet" type="text/css"/>

        <!-- always need these -->
        <script type="text/javascript" src="/static/app/javascript/always.js"></script>

        
        
            <link rel="stylesheet" type="text/css" href="/static/app/libs/yui/treeview/assets/folders.css"/>
            <link rel="stylesheet" type="text/css" href="/static/app/libs/yui/logger/assets/skins/sam/logger.css"/>
            <link rel="stylesheet" type="text/css" href="/static/app/libs/yui/tabview/assets/skins/sam/tabview.css"/>

            <script type="text/javascript" src="/static/app/javascript/yui2.js"></script>
        

        
        
            <script type="text/javascript" src="/static/app/javascript/grepcode.js"></script>
        

        
        
    
<script id="com-grepcode-web-entity-snapshot-ProjectSnapshotChooser-0">
function showSiblings(tLink) {
    var sDiv = tLink.nextSibling;
    while (sDiv.nodeType != 1) { sDiv = sDiv.nextSibling; }

    if (sDiv.style.visibility == "visible") {
        sDiv.style.visibility = "hidden";
    } else {
        var x = getPageOffsetLeft(tLink) - 7;
        var y = getPageOffsetTop(tLink) + tLink.offsetHeight + 5;
        sDiv.style.left = x + "px";
        sDiv.style.top = y + "px";
        sDiv.style.visibility = "visible";
    }
}
</script>
</head>

    <body>
        <div id="header">
            <div class="head-search">
                <div class="head-outer">
                    <div class="head-middle">
                        <div class="head-inner">
                            <div>
    <div class="search-panel">
        <form action="/search">
            <span id="query-container">
                <input id="search-field" type="text" name="query" value=""/>
            </span>
            <input type="hidden" name="n" value=""></input>
            <input type="submit" value="Search"/>
            <span id="search-field-focus-flag" style="display:none;">false</span>
        </form>
    </div>
    <script>
    YAHOO.util.Event.onDOMReady(function() {
        var flag = document.getElementById("search-field-focus-flag");
        if (flag && flag.innerHTML === 'true') {
            document.getElementById("search-field").focus();
        }
    }, null, true)
    </script>
</div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="logo">
                <div class="head-outer">
                    <div class="head-middle">
                        <div class="head-inner">
                            <a href="/"><img src="/static/app/images/logo-rel.gif" alt="Logo" width="200" height="50"/></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="head-menu head-menu-width">
                <div class="head-outer">
                    <div class="head-middle">
                        <div class="head-inner">
                            <span>
			                <a href="/?st=true">Stack Trace Search</a> |
                            </span>
                            <span>
                            <a href="/eclipse">Eclipse</a> |
                            <a href="/intellij">IntelliJ</a> |
                            <a href="/contact">Contact</a> |
                            <a href="/faq">FAQ</a>
                            </span>
                            
                            <span>
                            |
                            <a href="http://blog.grepcode.com/" rel="nofollow"><img title="Our Blog" alt="Blog" src="/static/app/images/site/blog.png" width="16" height="16" border="0"/></a>
                            <a href="http://twitter.com/grepcode/" rel="nofollow"><img title="Follow us on Twitter" alt="Twitter" src="/static/app/images/site/twitter.png" width="16" height="16" border="0"/></a>
                            <a href="http://www.facebook.com/pages/GrepCode/159698964349" rel="nofollow"><img title="Follow us on FaceBook" alt="FaceBook" src="/static/app/images/site/facebook.png" width="16" height="16" border="0"/></a>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
            <script type="text/javascript">
                    var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
                    document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
            </script>
            <script type="text/javascript">
                var pageTracker = _gat._getTracker("UA-7614624-1");
            </script>
        
        
            <script>
                function isGCEnterpriseEdition() {
                    return false;
                }
            </script>
        
        
    <div class="staging-page">
        
<div>
    <script>
    var projectTree = function() {
        var tree, currentIconMode, fileParts;

        function changeIconMode() {
            var newVal = parseInt(this.value);
            if (newVal != currentIconMode) {
                currentIconMode = newVal;
            }
            buildTree();
        }

        function loadNodeData(node, fnLoadComplete)  {
            var entityidParam = encodeURI(node.data.cb_entityid);
            var pathParam = encodeURI(node.data.cb_path);

            var sUrl = "/service/listsourcefiles?" + getEntityType() + "=" + entityidParam + "&path=" + pathParam;

            var callback = {

                success: function(oResponse) {
                    YAHOO.log("XHR transaction was successful.", "info", "example");
                    var oResults = eval("(" + oResponse.responseText + ")");
                    if (YAHOO.lang.isArray(oResults)) {
                        var level = node.data.cb_level + 1;
                        for(var i = 0; i < oResults.length; ++i) {
                            var oRes = oResults[i];
                            if (oRes.t == "d") {
                                var expand = oResults.length == 1;
                                if (isFileStagingPage() && level < fileParts.length) {
                                    if (fileParts[level] == oRes.n) {
                                        expand = true;
                                    }
                                }
                                var tempNode = new YAHOO.widget.TextNode(oRes.n, node, expand);
                                tempNode.data.cb_entityid = node.data.cb_entityid;
                                tempNode.data.cb_path = node.data.cb_path + oRes.n + "/";
                                tempNode.data.cb_level = level;
                            } else if (oRes.t == "f") {
                                if (isFileStagingPage() && level < fileParts.length && fileParts[level] == oRes.n) {
                                    var tempNode = new YAHOO.widget.TextNode(oRes.n, node, false);
                                    tempNode.isLeaf = true;
                                    tempNode.data.cb_level = level;
                                    tempNode.contentStyle = 'current-filename';
                                    // VRB - TODO - Capture div.x and div.y -- scroll div so it is in the center
                                } else {
                                    var tempNode = new YAHOO.widget.TextNode(oRes.n, node, false);
                                    tempNode.href = oRes.l+"?av=f";
                                    tempNode.isLeaf = true;
                                    tempNode.data.cb_level = level;
                                }
                            }
                        }
                    }
                    oResponse.argument.fnLoadComplete();
                },
                failure: function(oResponse) {
                    YAHOO.log("Failed to process XHR transaction.", "info", "example");
                    oResponse.argument.fnLoadComplete();
                },

                argument: {
                    "node": node,
                    "fnLoadComplete": fnLoadComplete
                },

                timeout: 7000
            };

            YAHOO.util.Connect.asyncRequest('GET', sUrl, callback);
        }

        function buildTree() {
            tree = new YAHOO.widget.TreeView("treeDiv");

            tree.setDynamicLoad(loadNodeData, currentIconMode);

            var root = tree.getRoot();

            var entityid = document.getElementById('treerootid_hidden').innerHTML;
            var tempNode = new YAHOO.widget.TextNode(createShortEntityIdLabel(entityid), root, true);
            tempNode.data.cb_entityid=entityid;
            tempNode.data.cb_path="/";
            tempNode.data.cb_level = -1;

            if (isFileStagingPage()) {
                var filePathStart = document.getElementById("entityid_hidden").innerHTML.lastIndexOf('@');
                var filePath = document.getElementById("entityid_hidden").innerHTML.substring(filePathStart + 1);
                fileParts = filePath.split('$');
            }

            tree.draw();
        }


        return {
            init: function() {
                YAHOO.util.Event.on(["mode0", "mode1"], "click", changeIconMode);
                var el = document.getElementById("mode1");
                if (el && el.checked) {
                    currentIconMode = parseInt(el.value);
                } else {
                    currentIconMode = 0;
                }

                buildTree();
            }
        }
    } ();            
    </script>
    <div id="treerootid_hidden" style="display:none">repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1</div>
    <div id="entityid_hidden" style="display:none">repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner$TestCaseCollector.java</div>
    <div id="entitytype_hidden" style="display:none">file</div>

    
    
<div class="file-staging-page">
    <div class="entity-header">
        <div class="entity-nav">
            <ul>
                <li><a href="http://repository.grepcode.com/java/ext/" rel="nofollow" class="external-link">GrepCode</a></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><a href="../../../../../../../../../../../project/repository.grepcode.com/java/ext/com.google.android/android/"><span title="com.google.android / android">com.google.android / android</span></a></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><span>
    <span>
        <a class="nav" href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.3_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span><img class='img_base img_jdt_elcl16_backward_nav' src='/static/app/images/1x1.gif' border='0' title='4.4.3_r1' width='16' height='16'></img></span></a>
    </span>
    <a title="Version" href="../../../../../../../../../../../snapshot/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/"><span id="current-snapshot">4.4.4_r1</span></a>
    
        <a href="#" class="snapshots-more"
           onclick="this.blur();showSiblings(this);return false;"><img class='img_base img_jdt_elcl16_next_nav' src='/static/app/images/1x1.gif' border='0' title='4.1.1_r1&nbsp;-&nbsp;5.0.0_r1' width='16' height='16'></img></a>
    
    <div class="snapshots-panel" style="visibility: hidden; z-index:2">
        <div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.0.0_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>5.0.0_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.L_preview/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>5.L_preview</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span class="this-snapshot">4.4.4_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.3_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>4.4.3_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.2_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>4.4.2_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.1_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>4.4.1_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>4.4_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3.1_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>4.3.1_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3_r2.1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>4.3_r2.1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>4.3_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.1.1_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span>4.1.1_r1</span></a>
        </div>
    </div>
    <span>
        <a class="nav" href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.L_preview/com/android/uiautomator/testrunner/TestCaseCollector.java/"><span><img class='img_base img_jdt_elcl16_forward_nav' src='/static/app/images/1x1.gif' border='0' title='5.L_preview' width='16' height='16'></img></span></a>
    </span>
</span></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><span class="entity-name" title="com.android.uiautomator.testrunner.TestCaseCollector">com.android.uiautomator.testrunner.TestCaseCollector</span></li>
            </ul>
            <div class="entity-header-links">
                
            <!-- Google +1 -->
            <div class="g-plusone" data-size="small" data-annotation="none"></div>
        
                <span><img class='img_base img_jdt_elcl16_search' src='/static/app/images/1x1.gif' border='0' title='Find usages' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../search/usages?id=repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector&amp;type=type&amp;k=u" rel="nofollow" title="Find usages of com.android.uiautomator.testrunner.TestCaseCollector">Find Usages</a>
                <span><img class='img_base img_jdt_eview16_compare_view' src='/static/app/images/1x1.gif' border='0' title='Diff' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/?v=diff&amp;id2=4.4.3_r1" rel="nofollow" title="Compare with version 4.4.3_r1">Diff</a>
                <span><img class='img_base img_jdt_obj16_source_editor' src='/static/app/images/1x1.gif' border='0' title='View as plain text' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/?v=source" rel="nofollow" title="View as plain text">Raw</a>
                <span><img class='img_base img_jdt_elcl16_save' src='/static/app/images/1x1.gif' border='0' title='Download file' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java/?v=source&amp;disposition=attachment" rel="nofollow" title="Download file">Download</a>
                <span><img class='img_base img_jdt_obj16_html_tag_obj' src='/static/app/images/1x1.gif' border='0' title='Generate HTML snippet' width='16' height='16'></img></span>
                
                    <a id="snippet-link" onclick="showSnippetDialog(1); this.blur(); return false;" href="#" title="Generate HTML widget for a fragment from this file">HTML Widget</a>
                
                
                
                
                
            </div>
        </div>
    </div>

    <div id="allviews_hidden" style="display:none">oh</div>
    <div id="activeview_hidden" style="display:none">f</div>
    <div id="bugs" style="display:none">[]</div>

    <div id="page-mask"></div>
    <div id="snippet-dropdown" class="snippet-dropdown">
        <div id="snippet-close" onclick="hideSnippetDialog();"><img class='img_base img_jdt_elcl16_delete' src='/static/app/images/1x1.gif' border='0' title='Close window' width='16' height='16'></img></div>
        <form id="snippet-form" action="#">
            <div class="snippet-line-input">
                Start line: <input name="snippet_start" type="text" maxlength="8" size="5" value="1" />&nbsp;
                <div class="snippet-spinner-button" onclick="decFromLine();"><img class='img_base img_jdt_obj16_remove_correction' src='/static/app/images/1x1.gif' border='0' title='Previous line' width='16' height='16'></img></div>
                <div class="snippet-spinner-button" onclick="incFromLine();"><img class='img_base img_jdt_elcl16_add' src='/static/app/images/1x1.gif' border='0' title='Next line' width='16' height='16'></img></div>
            </div>
            <div class="snippet-line-input">
                End line: <input name="snippet_end" type="text" maxlength="8" size="5" value="1" />&nbsp;
                <div class="snippet-spinner-button" onclick="decToLine();"><img class='img_base img_jdt_obj16_remove_correction' src='/static/app/images/1x1.gif' border='0' title='Previous line' width='16' height='16'></img></div>
                <div class="snippet-spinner-button" onclick="incToLine();"><img class='img_base img_jdt_elcl16_add' src='/static/app/images/1x1.gif' border='0' title='Next line' width='16' height='16'></img></div>
            </div>
            <div class="snippet-get-button">
                <input type="button" name="snippet_get" value="Create HTML" onclick="fetchSnippet();" />
            </div>
            <br/>
            <p>Snippet Preview</p>
            <div id="snippet-preview"></div>
            <p>Snippet HTML Code</p>
            <textarea name="snippet_html" rows="5" cols="60" readonly="true"></textarea>
        </form>
    </div>
    
    <div id="so-question-panel" class="so-question-panel">
        <div class="so-question-header">
            Stack Overflow Questions
            
        </div>
        
    </div>
    
    <div class="entity-container">
        <div class="file-entity-panel">
            <div id="file-nav-panel" class="file-nav-panel">
                <div class="file-nav-tabs-container">
                    <div id="file-nav-tabs" class="file-nav-tabs yui-skin-sam"></div>
                </div>
            </div>
            <div id="source-view" class="source-view">
                
                
                    <script type="text/javascript">
                    if (isBrowserMSIE()) {
                        document.write("<div style=\"padding: 20px;\">" + get468x60Ad() + "</div>");
                    }
                    </script>
                
                <div>
<div class="code-panel">
<div class="jsrc">
<div class="line" id="line-1"><div class="lnml" id="lnml-1"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(1);" onmouseout="untriggerLineHotspot(1);"><pre><a name="1" href="#1">1</a></pre></div><div class="lnmr" id="lnmr-1" onmouseover="triggerLineHotspot(1);" onmouseout="untriggerLineHotspot(1);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(1); return false;"><img id="lnhs-1" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">/*</span></pre></div><div class="line" id="line-2"><div class="lnml" id="lnml-2"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(2);" onmouseout="untriggerLineHotspot(2);"><pre><a name="2" href="#2">2</a></pre></div><div class="lnmr" id="lnmr-2" onmouseover="triggerLineHotspot(2);" onmouseout="untriggerLineHotspot(2);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(2); return false;"><img id="lnhs-2" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;Copyright&nbsp;(C)&nbsp;2012&nbsp;The&nbsp;Android&nbsp;Open&nbsp;Source&nbsp;Project</span></pre></div><div class="line" id="line-3"><div class="lnml" id="lnml-3"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(3);" onmouseout="untriggerLineHotspot(3);"><pre><a name="3" href="#3">3</a></pre></div><div class="lnmr" id="lnmr-3" onmouseover="triggerLineHotspot(3);" onmouseout="untriggerLineHotspot(3);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(3); return false;"><img id="lnhs-3" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*</span></pre></div><div class="line" id="line-4"><div class="lnml" id="lnml-4"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(4);" onmouseout="untriggerLineHotspot(4);"><pre><a name="4" href="#4">4</a></pre></div><div class="lnmr" id="lnmr-4" onmouseover="triggerLineHotspot(4);" onmouseout="untriggerLineHotspot(4);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(4); return false;"><img id="lnhs-4" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;Licensed&nbsp;under&nbsp;the&nbsp;Apache&nbsp;License,&nbsp;Version&nbsp;2.0&nbsp;(the&nbsp;"License");</span></pre></div><div class="line" id="line-5"><div class="lnml" id="lnml-5"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(5);" onmouseout="untriggerLineHotspot(5);"><pre><a name="5" href="#5">5</a></pre></div><div class="lnmr" id="lnmr-5" onmouseover="triggerLineHotspot(5);" onmouseout="untriggerLineHotspot(5);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(5); return false;"><img id="lnhs-5" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;you&nbsp;may&nbsp;not&nbsp;use&nbsp;this&nbsp;file&nbsp;except&nbsp;in&nbsp;compliance&nbsp;with&nbsp;the&nbsp;License.</span></pre></div><div class="line" id="line-6"><div class="lnml" id="lnml-6"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(6);" onmouseout="untriggerLineHotspot(6);"><pre><a name="6" href="#6">6</a></pre></div><div class="lnmr" id="lnmr-6" onmouseover="triggerLineHotspot(6);" onmouseout="untriggerLineHotspot(6);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(6); return false;"><img id="lnhs-6" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;You&nbsp;may&nbsp;obtain&nbsp;a&nbsp;copy&nbsp;of&nbsp;the&nbsp;License&nbsp;at</span></pre></div><div class="line" id="line-7"><div class="lnml" id="lnml-7"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(7);" onmouseout="untriggerLineHotspot(7);"><pre><a name="7" href="#7">7</a></pre></div><div class="lnmr" id="lnmr-7" onmouseover="triggerLineHotspot(7);" onmouseout="untriggerLineHotspot(7);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(7); return false;"><img id="lnhs-7" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*</span></pre></div><div class="line" id="line-8"><div class="lnml" id="lnml-8"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(8);" onmouseout="untriggerLineHotspot(8);"><pre><a name="8" href="#8">8</a></pre></div><div class="lnmr" id="lnmr-8" onmouseover="triggerLineHotspot(8);" onmouseout="untriggerLineHotspot(8);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(8); return false;"><img id="lnhs-8" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;http://www.apache.org/licenses/LICENSE-2.0</span></pre></div><div class="line" id="line-9"><div class="lnml" id="lnml-9"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(9);" onmouseout="untriggerLineHotspot(9);"><pre><a name="9" href="#9">9</a></pre></div><div class="lnmr" id="lnmr-9" onmouseover="triggerLineHotspot(9);" onmouseout="untriggerLineHotspot(9);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(9); return false;"><img id="lnhs-9" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*</span></pre></div><div class="line" id="line-10"><div class="lnml" id="lnml-10"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(10);" onmouseout="untriggerLineHotspot(10);"><pre><a name="10" href="#10">10</a></pre></div><div class="lnmr" id="lnmr-10" onmouseover="triggerLineHotspot(10);" onmouseout="untriggerLineHotspot(10);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(10); return false;"><img id="lnhs-10" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;Unless&nbsp;required&nbsp;by&nbsp;applicable&nbsp;law&nbsp;or&nbsp;agreed&nbsp;to&nbsp;in&nbsp;writing,&nbsp;software</span></pre></div><div class="line" id="line-11"><div class="lnml" id="lnml-11"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(11);" onmouseout="untriggerLineHotspot(11);"><pre><a name="11" href="#11">11</a></pre></div><div class="lnmr" id="lnmr-11" onmouseover="triggerLineHotspot(11);" onmouseout="untriggerLineHotspot(11);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(11); return false;"><img id="lnhs-11" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;distributed&nbsp;under&nbsp;the&nbsp;License&nbsp;is&nbsp;distributed&nbsp;on&nbsp;an&nbsp;"AS&nbsp;IS"&nbsp;BASIS,</span></pre></div><div class="line" id="line-12"><div class="lnml" id="lnml-12"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(12);" onmouseout="untriggerLineHotspot(12);"><pre><a name="12" href="#12">12</a></pre></div><div class="lnmr" id="lnmr-12" onmouseover="triggerLineHotspot(12);" onmouseout="untriggerLineHotspot(12);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(12); return false;"><img id="lnhs-12" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;WITHOUT&nbsp;WARRANTIES&nbsp;OR&nbsp;CONDITIONS&nbsp;OF&nbsp;ANY&nbsp;KIND,&nbsp;either&nbsp;express&nbsp;or&nbsp;implied.</span></pre></div><div class="line" id="line-13"><div class="lnml" id="lnml-13"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(13);" onmouseout="untriggerLineHotspot(13);"><pre><a name="13" href="#13">13</a></pre></div><div class="lnmr" id="lnmr-13" onmouseover="triggerLineHotspot(13);" onmouseout="untriggerLineHotspot(13);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(13); return false;"><img id="lnhs-13" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;See&nbsp;the&nbsp;License&nbsp;for&nbsp;the&nbsp;specific&nbsp;language&nbsp;governing&nbsp;permissions&nbsp;and</span></pre></div><div class="line" id="line-14"><div class="lnml" id="lnml-14"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(14);" onmouseout="untriggerLineHotspot(14);"><pre><a name="14" href="#14">14</a></pre></div><div class="lnmr" id="lnmr-14" onmouseover="triggerLineHotspot(14);" onmouseout="untriggerLineHotspot(14);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(14); return false;"><img id="lnhs-14" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;limitations&nbsp;under&nbsp;the&nbsp;License.</span></pre></div><div class="line" id="line-15"><div class="lnml" id="lnml-15"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(15);" onmouseout="untriggerLineHotspot(15);"><pre><a name="15" href="#15">15</a></pre></div><div class="lnmr" id="lnmr-15" onmouseover="triggerLineHotspot(15);" onmouseout="untriggerLineHotspot(15);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(15); return false;"><img id="lnhs-15" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*/</span></pre></div><div class="line" id="line-16"><div class="lnml" id="lnml-16"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(16);" onmouseout="untriggerLineHotspot(16);"><pre><a name="16" href="#16">16</a></pre></div><div class="lnmr" id="lnmr-16" onmouseover="triggerLineHotspot(16);" onmouseout="untriggerLineHotspot(16);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(16); return false;"><img id="lnhs-16" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-17"><div class="lnml" id="lnml-17"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(17);" onmouseout="untriggerLineHotspot(17);"><pre><a name="17" href="#17">17</a></pre></div><div class="lnmr" id="lnmr-17" onmouseover="triggerLineHotspot(17);" onmouseout="untriggerLineHotspot(17);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(17); return false;"><img id="lnhs-17" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">package</span>&nbsp;com.android.uiautomator.testrunner;</pre></div><div class="line" id="line-18"><div class="lnml" id="lnml-18"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(18);" onmouseout="untriggerLineHotspot(18);"><pre><a name="18" href="#18">18</a></pre></div><div class="lnmr" id="lnmr-18" onmouseover="triggerLineHotspot(18);" onmouseout="untriggerLineHotspot(18);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(18); return false;"><img id="lnhs-18" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-19"><div class="lnml" id="lnml-19"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(19);" onmouseout="untriggerLineHotspot(19);"><pre><a name="19" href="#19">19</a></pre></div><div class="lnmr" id="lnmr-19" onmouseover="triggerLineHotspot(19);" onmouseout="untriggerLineHotspot(19);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(19); return false;"><img id="lnhs-19" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/TestCase.java#TestCase" title="junit.framework.TestCase">junit.framework.TestCase</a>;</pre></div><div class="line" id="line-20"><div class="lnml" id="lnml-20"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(20);" onmouseout="untriggerLineHotspot(20);"><pre><a name="20" href="#20">20</a></pre></div><div class="lnmr" id="lnmr-20" onmouseover="triggerLineHotspot(20);" onmouseout="untriggerLineHotspot(20);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(20); return false;"><img id="lnhs-20" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-21"><div class="lnml" id="lnml-21"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(21);" onmouseout="untriggerLineHotspot(21);"><pre><a name="21" href="#21">21</a></pre></div><div class="lnmr" id="lnmr-21" onmouseover="triggerLineHotspot(21);" onmouseout="untriggerLineHotspot(21);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(21); return false;"><img id="lnhs-21" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/reflect/Method.java#Method" title="java.lang.reflect.Method">java.lang.reflect.Method</a>;</pre></div><div class="line" id="line-22"><div class="lnml" id="lnml-22"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(22);" onmouseout="untriggerLineHotspot(22);"><pre><a name="22" href="#22">22</a></pre></div><div class="lnmr" id="lnmr-22" onmouseover="triggerLineHotspot(22);" onmouseout="untriggerLineHotspot(22);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(22); return false;"><img id="lnhs-22" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/ArrayList.java#ArrayList" title="java.util.ArrayList">java.util.ArrayList</a>;</pre></div><div class="line" id="line-23"><div class="lnml" id="lnml-23"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(23);" onmouseout="untriggerLineHotspot(23);"><pre><a name="23" href="#23">23</a></pre></div><div class="lnmr" id="lnmr-23" onmouseover="triggerLineHotspot(23);" onmouseout="untriggerLineHotspot(23);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(23); return false;"><img id="lnhs-23" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/Collections.java#Collections" title="java.util.Collections">java.util.Collections</a>;</pre></div><div class="line" id="line-24"><div class="lnml" id="lnml-24"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(24);" onmouseout="untriggerLineHotspot(24);"><pre><a name="24" href="#24">24</a></pre></div><div class="lnmr" id="lnmr-24" onmouseover="triggerLineHotspot(24);" onmouseout="untriggerLineHotspot(24);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(24); return false;"><img id="lnhs-24" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/List.java#List" title="java.util.List">java.util.List</a>;<br/><a name="24"></a><br/><a name="25"></a></pre></div><div class="javadoc-area"><div class="javadoc"><a name="26"></a><a name="27"></a><a name="28"></a><a name="29"></a> A convenient class that encapsulates functions for adding test classes

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key">Hide:</span></dt><dd></dd></dl></div></div></div><div class="line" id="line-30"><div class="lnml" id="lnml-30"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(30);" onmouseout="untriggerLineHotspot(30);"><pre><a name="30" href="#30">30</a></pre></div><div class="lnmr" id="lnmr-30" onmouseover="triggerLineHotspot(30);" onmouseout="untriggerLineHotspot(30);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(30); return false;"><img id="lnhs-30" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-31"><div class="lnml" id="lnml-31"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(31);" onmouseout="untriggerLineHotspot(31);"><pre><a name="31" href="#31">31</a></pre></div><div class="lnmr" id="lnmr-31" onmouseover="triggerLineHotspot(31);" onmouseout="untriggerLineHotspot(31);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(31); return false;"><img id="lnhs-31" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">class</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'type','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector">TestCaseCollector</a>&nbsp;{</pre></div><div class="line" id="line-32"><div class="lnml" id="lnml-32"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(32);" onmouseout="untriggerLineHotspot(32);"><pre><a name="32" href="#32">32</a></pre></div><div class="lnmr" id="lnmr-32" onmouseover="triggerLineHotspot(32);" onmouseout="untriggerLineHotspot(32);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(32); return false;"><img id="lnhs-32" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-33"><div class="lnml" id="lnml-33"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(33);" onmouseout="untriggerLineHotspot(33);"><pre><a name="33" href="#33">33</a></pre></div><div class="lnmr" id="lnmr-33" onmouseover="triggerLineHotspot(33);" onmouseout="untriggerLineHotspot(33);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(33); return false;"><img id="lnhs-33" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/ClassLoader.java#ClassLoader" title="java.lang.ClassLoader">ClassLoader</a>&nbsp;<span class="mark-0#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="TestCaseCollector.0mClassLoader">mClassLoader</a></span>;</pre></div><div class="line" id="line-34"><div class="lnml" id="lnml-34"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(34);" onmouseout="untriggerLineHotspot(34);"><pre><a name="34" href="#34">34</a></pre></div><div class="lnmr" id="lnmr-34" onmouseover="triggerLineHotspot(34);" onmouseout="untriggerLineHotspot(34);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(34); return false;"><img id="lnhs-34" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/List.java#List" title="java.util.List">List</a>&lt;<a href="/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/TestCase.java#TestCase" title="junit.framework.TestCase">TestCase</a>>&nbsp;<span class="mark-1#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="TestCaseCollector.0mTestCases">mTestCases</a></span>;</pre></div><div class="line" id="line-35"><div class="lnml" id="lnml-35"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(35);" onmouseout="untriggerLineHotspot(35);"><pre><a name="35" href="#35">35</a></pre></div><div class="lnmr" id="lnmr-35" onmouseover="triggerLineHotspot(35);" onmouseout="untriggerLineHotspot(35);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(35); return false;"><img id="lnhs-35" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.TestCaseFilter" title="com.android.uiautomator.testrunner.TestCaseCollector.TestCaseFilter">TestCaseFilter</a>&nbsp;<span class="mark-2#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="TestCaseCollector.0mFilter">mFilter</a></span>;</pre></div><div class="line" id="line-36"><div class="lnml" id="lnml-36"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(36);" onmouseout="untriggerLineHotspot(36);"><pre><a name="36" href="#36">36</a></pre></div><div class="lnmr" id="lnmr-36" onmouseover="triggerLineHotspot(36);" onmouseout="untriggerLineHotspot(36);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(36); return false;"><img id="lnhs-36" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-37"><div class="lnml" id="lnml-37"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(37);" onmouseout="untriggerLineHotspot(37);"><pre><a name="37" href="#37">37</a></pre></div><div class="lnmr" id="lnmr-37" onmouseover="triggerLineHotspot(37);" onmouseout="untriggerLineHotspot(37);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(37); return false;"><img id="lnhs-37" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@<init>(java.lang.ClassLoader,com.android.uiautomator.testrunner.TestCaseCollector.TestCaseFilter)',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.%3Cinit%3E%28java.lang.ClassLoader%2Ccom.android.uiautomator.testrunner.TestCaseCollector.TestCaseFilter%29">TestCaseCollector</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/ClassLoader.java#ClassLoader" title="java.lang.ClassLoader">ClassLoader</a>&nbsp;<span class="mark-3#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">classLoader</span>,&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.TestCaseFilter" title="com.android.uiautomator.testrunner.TestCaseCollector.TestCaseFilter">TestCaseFilter</a>&nbsp;<span class="mark-4#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">filter</span>)&nbsp;{</pre></div><div class="line" id="line-38"><div class="lnml" id="lnml-38"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(38);" onmouseout="untriggerLineHotspot(38);"><pre><a name="38" href="#38">38</a></pre></div><div class="lnmr" id="lnmr-38" onmouseover="triggerLineHotspot(38);" onmouseout="untriggerLineHotspot(38);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(38); return false;"><img id="lnhs-38" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-0#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mClassLoader" title="ClassLoader mClassLoader" class="hidden">mClassLoader</a></span>&nbsp;=&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">classLoader</span>;</pre></div><div class="line" id="line-39"><div class="lnml" id="lnml-39"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(39);" onmouseout="untriggerLineHotspot(39);"><pre><a name="39" href="#39">39</a></pre></div><div class="lnmr" id="lnmr-39" onmouseover="triggerLineHotspot(39);" onmouseout="untriggerLineHotspot(39);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(39); return false;"><img id="lnhs-39" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-1#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mTestCases" title="List mTestCases" class="hidden">mTestCases</a></span>&nbsp;=&nbsp;<span class="kw">new</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/ArrayList.java#ArrayList" title="java.util.ArrayList">ArrayList</a>&lt;<a href="/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/TestCase.java#TestCase" title="junit.framework.TestCase">TestCase</a>>();</pre></div><div class="line" id="line-40"><div class="lnml" id="lnml-40"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(40);" onmouseout="untriggerLineHotspot(40);"><pre><a name="40" href="#40">40</a></pre></div><div class="lnmr" id="lnmr-40" onmouseover="triggerLineHotspot(40);" onmouseout="untriggerLineHotspot(40);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(40); return false;"><img id="lnhs-40" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-2#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mFilter" title="TestCaseFilter mFilter" class="hidden">mFilter</a></span>&nbsp;=&nbsp;<span class="mark-4#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">filter</span>;</pre></div><div class="line" id="line-41"><div class="lnml" id="lnml-41"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(41);" onmouseout="untriggerLineHotspot(41);"><pre><a name="41" href="#41">41</a></pre></div><div class="lnmr" id="lnmr-41" onmouseover="triggerLineHotspot(41);" onmouseout="untriggerLineHotspot(41);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(41); return false;"><img id="lnhs-41" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="41"></a><br/><a name="42"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="43"></a><a name="44"></a><a name="45"></a><a name="46"></a><a name="47"></a><a name="48"></a><a name="49"></a> Adds classes to test by providing a list of class names in string

 The class name may be in &quot;&lt;class name&gt;#&lt;method name&gt;&quot; format

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>classNames</code> class must be subclass of <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/UiAutomatorTestCase.java#UiAutomatorTestCase' title='com.android.uiautomator.testrunner.UiAutomatorTestCase'>UiAutomatorTestCase</a></code></code></dd><dt><span class="javadoc-key"> Throws:</span></dt><dd><code><a href='/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/ClassNotFoundException.java#ClassNotFoundException' title='java.lang.ClassNotFoundException'>java.lang.ClassNotFoundException</a></code></dd></dl></div></div></div><div class="line" id="line-50"><div class="lnml" id="lnml-50"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(50);" onmouseout="untriggerLineHotspot(50);"><pre><a name="50" href="#50">50</a></pre></div><div class="lnmr" id="lnmr-50" onmouseover="triggerLineHotspot(50);" onmouseout="untriggerLineHotspot(50);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(50); return false;"><img id="lnhs-50" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-51"><div class="lnml" id="lnml-51"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(51);" onmouseout="untriggerLineHotspot(51);"><pre><a name="51" href="#51">51</a></pre></div><div class="lnmr" id="lnmr-51" onmouseover="triggerLineHotspot(51);" onmouseout="untriggerLineHotspot(51);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(51); return false;"><img id="lnhs-51" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addTestClasses(java.util.List)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.addTestClasses%28java.util.List%29">addTestClasses</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/List.java#List" title="java.util.List">List</a>&lt;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>>&nbsp;<span class="mark-5#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">classNames</span>)&nbsp;<span class="kw">throws</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/ClassNotFoundException.java#ClassNotFoundException" title="java.lang.ClassNotFoundException">ClassNotFoundException</a>&nbsp;{</pre></div><div class="line" id="line-52"><div class="lnml" id="lnml-52"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(52);" onmouseout="untriggerLineHotspot(52);"><pre><a name="52" href="#52">52</a></pre></div><div class="lnmr" id="lnmr-52" onmouseover="triggerLineHotspot(52);" onmouseout="untriggerLineHotspot(52);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(52); return false;"><img id="lnhs-52" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">for</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>&nbsp;<span class="mark-6#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>&nbsp;:&nbsp;<span class="mark-5#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">classNames</span>)&nbsp;{</pre></div><div class="line" id="line-53"><div class="lnml" id="lnml-53"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(53);" onmouseout="untriggerLineHotspot(53);"><pre><a name="53" href="#53">53</a></pre></div><div class="lnmr" id="lnmr-53" onmouseover="triggerLineHotspot(53);" onmouseout="untriggerLineHotspot(53);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(53); return false;"><img id="lnhs-53" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.addTestClass%28java.lang.String%29" title="com.android.uiautomator.testrunner.TestCaseCollector.addTestClass(java.lang.String) : void">addTestClass</a>(<span class="mark-6#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>);</pre></div><div class="line" id="line-54"><div class="lnml" id="lnml-54"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(54);" onmouseout="untriggerLineHotspot(54);"><pre><a name="54" href="#54">54</a></pre></div><div class="lnmr" id="lnmr-54" onmouseover="triggerLineHotspot(54);" onmouseout="untriggerLineHotspot(54);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(54); return false;"><img id="lnhs-54" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-55"><div class="lnml" id="lnml-55"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(55);" onmouseout="untriggerLineHotspot(55);"><pre><a name="55" href="#55">55</a></pre></div><div class="lnmr" id="lnmr-55" onmouseover="triggerLineHotspot(55);" onmouseout="untriggerLineHotspot(55);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(55); return false;"><img id="lnhs-55" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="55"></a><br/><a name="56"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="57"></a><a name="58"></a><a name="59"></a><a name="60"></a><a name="61"></a><a name="62"></a><a name="63"></a> Adds class to test by providing class name in string.

 The class name may be in &quot;&lt;class name&gt;#&lt;method name&gt;&quot; format

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>className</code> classes must be subclass of <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/UiAutomatorTestCase.java#UiAutomatorTestCase' title='com.android.uiautomator.testrunner.UiAutomatorTestCase'>UiAutomatorTestCase</a></code></code></dd><dt><span class="javadoc-key"> Throws:</span></dt><dd><code><a href='/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/ClassNotFoundException.java#ClassNotFoundException' title='java.lang.ClassNotFoundException'>java.lang.ClassNotFoundException</a></code></dd></dl></div></div></div><div class="line" id="line-64"><div class="lnml" id="lnml-64"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(64);" onmouseout="untriggerLineHotspot(64);"><pre><a name="64" href="#64">64</a></pre></div><div class="lnmr" id="lnmr-64" onmouseover="triggerLineHotspot(64);" onmouseout="untriggerLineHotspot(64);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(64); return false;"><img id="lnhs-64" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-65"><div class="lnml" id="lnml-65"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(65);" onmouseout="untriggerLineHotspot(65);"><pre><a name="65" href="#65">65</a></pre></div><div class="lnmr" id="lnmr-65" onmouseover="triggerLineHotspot(65);" onmouseout="untriggerLineHotspot(65);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(65); return false;"><img id="lnhs-65" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addTestClass(java.lang.String)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.addTestClass%28java.lang.String%29">addTestClass</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>&nbsp;<span class="mark-7#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>)&nbsp;<span class="kw">throws</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/ClassNotFoundException.java#ClassNotFoundException" title="java.lang.ClassNotFoundException">ClassNotFoundException</a>&nbsp;{</pre></div><div class="line" id="line-66"><div class="lnml" id="lnml-66"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(66);" onmouseout="untriggerLineHotspot(66);"><pre><a name="66" href="#66">66</a></pre></div><div class="lnmr" id="lnmr-66" onmouseover="triggerLineHotspot(66);" onmouseout="untriggerLineHotspot(66);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(66); return false;"><img id="lnhs-66" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">int</span>&nbsp;<span class="mark-8#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">hashPos</span>&nbsp;=&nbsp;<span class="mark-7#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String.indexOf%28int%29" title="java.lang.String.indexOf(int) : int">indexOf</a>(<span class="strliteral">'#'</span>);</pre></div><div class="line" id="line-67"><div class="lnml" id="lnml-67"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(67);" onmouseout="untriggerLineHotspot(67);"><pre><a name="67" href="#67">67</a></pre></div><div class="lnmr" id="lnmr-67" onmouseover="triggerLineHotspot(67);" onmouseout="untriggerLineHotspot(67);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(67); return false;"><img id="lnhs-67" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>&nbsp;<span class="mark-9#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">methodName</span>&nbsp;=&nbsp;<span class="kw">null</span>;</pre></div><div class="line" id="line-68"><div class="lnml" id="lnml-68"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(68);" onmouseout="untriggerLineHotspot(68);"><pre><a name="68" href="#68">68</a></pre></div><div class="lnmr" id="lnmr-68" onmouseover="triggerLineHotspot(68);" onmouseout="untriggerLineHotspot(68);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(68); return false;"><img id="lnhs-68" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-8#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">hashPos</span>&nbsp;!=&nbsp;-1)&nbsp;{</pre></div><div class="line" id="line-69"><div class="lnml" id="lnml-69"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(69);" onmouseout="untriggerLineHotspot(69);"><pre><a name="69" href="#69">69</a></pre></div><div class="lnmr" id="lnmr-69" onmouseover="triggerLineHotspot(69);" onmouseout="untriggerLineHotspot(69);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(69); return false;"><img id="lnhs-69" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-9#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">methodName</span>&nbsp;=&nbsp;<span class="mark-7#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String.substring%28int%29" title="java.lang.String.substring(int) : String">substring</a>(<span class="mark-8#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">hashPos</span>&nbsp;+&nbsp;1);</pre></div><div class="line" id="line-70"><div class="lnml" id="lnml-70"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(70);" onmouseout="untriggerLineHotspot(70);"><pre><a name="70" href="#70">70</a></pre></div><div class="lnmr" id="lnmr-70" onmouseover="triggerLineHotspot(70);" onmouseout="untriggerLineHotspot(70);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(70); return false;"><img id="lnhs-70" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-7#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>&nbsp;=&nbsp;<span class="mark-7#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String.substring%28int%2Cint%29" title="java.lang.String.substring(int,int) : String">substring</a>(0,&nbsp;<span class="mark-8#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">hashPos</span>);</pre></div><div class="line" id="line-71"><div class="lnml" id="lnml-71"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(71);" onmouseout="untriggerLineHotspot(71);"><pre><a name="71" href="#71">71</a></pre></div><div class="lnmr" id="lnmr-71" onmouseover="triggerLineHotspot(71);" onmouseout="untriggerLineHotspot(71);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(71); return false;"><img id="lnhs-71" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-72"><div class="lnml" id="lnml-72"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(72);" onmouseout="untriggerLineHotspot(72);"><pre><a name="72" href="#72">72</a></pre></div><div class="lnmr" id="lnmr-72" onmouseover="triggerLineHotspot(72);" onmouseout="untriggerLineHotspot(72);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(72); return false;"><img id="lnhs-72" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.addTestClass%28java.lang.String%2Cjava.lang.String%29" title="com.android.uiautomator.testrunner.TestCaseCollector.addTestClass(java.lang.String,java.lang.String) : void">addTestClass</a>(<span class="mark-7#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>,&nbsp;<span class="mark-9#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">methodName</span>);</pre></div><div class="line" id="line-73"><div class="lnml" id="lnml-73"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(73);" onmouseout="untriggerLineHotspot(73);"><pre><a name="73" href="#73">73</a></pre></div><div class="lnmr" id="lnmr-73" onmouseover="triggerLineHotspot(73);" onmouseout="untriggerLineHotspot(73);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(73); return false;"><img id="lnhs-73" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="73"></a><br/><a name="74"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="75"></a><a name="76"></a><a name="77"></a><a name="78"></a><a name="79"></a><a name="80"></a><a name="81"></a> Adds class to test by providing class name and method name in separate strings

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>className</code> class must be subclass of <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/UiAutomatorTestCase.java#UiAutomatorTestCase' title='com.android.uiautomator.testrunner.UiAutomatorTestCase'>UiAutomatorTestCase</a></code></code></dd><dd><code>methodName</code> may be null, in which case all &quot;public void testNNN(void)&quot; functions
                   will be added</dd><dt><span class="javadoc-key"> Throws:</span></dt><dd><code><a href='/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/ClassNotFoundException.java#ClassNotFoundException' title='java.lang.ClassNotFoundException'>java.lang.ClassNotFoundException</a></code></dd></dl></div></div></div><div class="line" id="line-82"><div class="lnml" id="lnml-82"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(82);" onmouseout="untriggerLineHotspot(82);"><pre><a name="82" href="#82">82</a></pre></div><div class="lnmr" id="lnmr-82" onmouseover="triggerLineHotspot(82);" onmouseout="untriggerLineHotspot(82);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(82); return false;"><img id="lnhs-82" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-83"><div class="lnml" id="lnml-83"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(83);" onmouseout="untriggerLineHotspot(83);"><pre><a name="83" href="#83">83</a></pre></div><div class="lnmr" id="lnmr-83" onmouseover="triggerLineHotspot(83);" onmouseout="untriggerLineHotspot(83);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(83); return false;"><img id="lnhs-83" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addTestClass(java.lang.String,java.lang.String)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.addTestClass%28java.lang.String%2Cjava.lang.String%29">addTestClass</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>&nbsp;<span class="mark-10#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>,&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>&nbsp;<span class="mark-11#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">methodName</span>)&nbsp;<span class="kw">throws</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/ClassNotFoundException.java#ClassNotFoundException" title="java.lang.ClassNotFoundException">ClassNotFoundException</a>&nbsp;{</pre></div><div class="line" id="line-84"><div class="lnml" id="lnml-84"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(84);" onmouseout="untriggerLineHotspot(84);"><pre><a name="84" href="#84">84</a></pre></div><div class="lnmr" id="lnmr-84" onmouseover="triggerLineHotspot(84);" onmouseout="untriggerLineHotspot(84);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(84); return false;"><img id="lnhs-84" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class" title="java.lang.Class">Class</a>&lt;?>&nbsp;<span class="mark-12#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>&nbsp;=&nbsp;<span class="mark-0#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mClassLoader" title="ClassLoader mClassLoader" class="hidden">mClassLoader</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/ClassLoader.java#ClassLoader.loadClass%28java.lang.String%29" title="java.lang.ClassLoader.loadClass(java.lang.String) : Class">loadClass</a>(<span class="mark-10#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">className</span>);</pre></div><div class="line" id="line-85"><div class="lnml" id="lnml-85"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(85);" onmouseout="untriggerLineHotspot(85);"><pre><a name="85" href="#85">85</a></pre></div><div class="lnmr" id="lnmr-85" onmouseover="triggerLineHotspot(85);" onmouseout="untriggerLineHotspot(85);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(85); return false;"><img id="lnhs-85" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-11#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">methodName</span>&nbsp;!=&nbsp;<span class="kw">null</span>)&nbsp;{</pre></div><div class="line" id="line-86"><div class="lnml" id="lnml-86"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(86);" onmouseout="untriggerLineHotspot(86);"><pre><a name="86" href="#86">86</a></pre></div><div class="lnmr" id="lnmr-86" onmouseover="triggerLineHotspot(86);" onmouseout="untriggerLineHotspot(86);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(86); return false;"><img id="lnhs-86" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.addSingleTestMethod%28java.lang.Class%2Cjava.lang.String%29" title="com.android.uiautomator.testrunner.TestCaseCollector.addSingleTestMethod(java.lang.Class,java.lang.String) : void">addSingleTestMethod</a>(<span class="mark-12#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>,&nbsp;<span class="mark-11#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">methodName</span>);</pre></div><div class="line" id="line-87"><div class="lnml" id="lnml-87"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(87);" onmouseout="untriggerLineHotspot(87);"><pre><a name="87" href="#87">87</a></pre></div><div class="lnmr" id="lnmr-87" onmouseover="triggerLineHotspot(87);" onmouseout="untriggerLineHotspot(87);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(87); return false;"><img id="lnhs-87" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">else</span>&nbsp;{</pre></div><div class="line" id="line-88"><div class="lnml" id="lnml-88"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(88);" onmouseout="untriggerLineHotspot(88);"><pre><a name="88" href="#88">88</a></pre></div><div class="lnmr" id="lnmr-88" onmouseover="triggerLineHotspot(88);" onmouseout="untriggerLineHotspot(88);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(88); return false;"><img id="lnhs-88" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/reflect/Method.java#Method%5B%5D" title="java.lang.reflect.Method[]">Method</a>[]&nbsp;<span class="mark-13#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">methods</span>&nbsp;=&nbsp;<span class="mark-12#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class.getMethods%28%29" title="java.lang.Class.getMethods() : Method[]">getMethods</a>();</pre></div><div class="line" id="line-89"><div class="lnml" id="lnml-89"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(89);" onmouseout="untriggerLineHotspot(89);"><pre><a name="89" href="#89">89</a></pre></div><div class="lnmr" id="lnmr-89" onmouseover="triggerLineHotspot(89);" onmouseout="untriggerLineHotspot(89);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(89); return false;"><img id="lnhs-89" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">for</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/reflect/Method.java#Method" title="java.lang.reflect.Method">Method</a>&nbsp;<span class="mark-14#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">method</span>&nbsp;:&nbsp;<span class="mark-13#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">methods</span>)&nbsp;{</pre></div><div class="line" id="line-90"><div class="lnml" id="lnml-90"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(90);" onmouseout="untriggerLineHotspot(90);"><pre><a name="90" href="#90">90</a></pre></div><div class="lnmr" id="lnmr-90" onmouseover="triggerLineHotspot(90);" onmouseout="untriggerLineHotspot(90);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(90); return false;"><img id="lnhs-90" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-2#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mFilter" title="TestCaseFilter mFilter" class="hidden">mFilter</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.TestCaseFilter.accept%28java.lang.reflect.Method%29" title="com.android.uiautomator.testrunner.TestCaseCollector.TestCaseFilter.accept(java.lang.reflect.Method) : boolean">accept</a>(<span class="mark-14#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">method</span>))&nbsp;{</pre></div><div class="line" id="line-91"><div class="lnml" id="lnml-91"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(91);" onmouseout="untriggerLineHotspot(91);"><pre><a name="91" href="#91">91</a></pre></div><div class="lnmr" id="lnmr-91" onmouseover="triggerLineHotspot(91);" onmouseout="untriggerLineHotspot(91);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(91); return false;"><img id="lnhs-91" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.addSingleTestMethod%28java.lang.Class%2Cjava.lang.String%29" title="com.android.uiautomator.testrunner.TestCaseCollector.addSingleTestMethod(java.lang.Class,java.lang.String) : void">addSingleTestMethod</a>(<span class="mark-12#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>,&nbsp;<span class="mark-14#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">method</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/reflect/Method.java#Method.getName%28%29" title="java.lang.reflect.Method.getName() : String">getName</a>());</pre></div><div class="line" id="line-92"><div class="lnml" id="lnml-92"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(92);" onmouseout="untriggerLineHotspot(92);"><pre><a name="92" href="#92">92</a></pre></div><div class="lnmr" id="lnmr-92" onmouseover="triggerLineHotspot(92);" onmouseout="untriggerLineHotspot(92);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(92); return false;"><img id="lnhs-92" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-93"><div class="lnml" id="lnml-93"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(93);" onmouseout="untriggerLineHotspot(93);"><pre><a name="93" href="#93">93</a></pre></div><div class="lnmr" id="lnmr-93" onmouseover="triggerLineHotspot(93);" onmouseout="untriggerLineHotspot(93);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(93); return false;"><img id="lnhs-93" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-94"><div class="lnml" id="lnml-94"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(94);" onmouseout="untriggerLineHotspot(94);"><pre><a name="94" href="#94">94</a></pre></div><div class="lnmr" id="lnmr-94" onmouseover="triggerLineHotspot(94);" onmouseout="untriggerLineHotspot(94);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(94); return false;"><img id="lnhs-94" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-95"><div class="lnml" id="lnml-95"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(95);" onmouseout="untriggerLineHotspot(95);"><pre><a name="95" href="#95">95</a></pre></div><div class="lnmr" id="lnmr-95" onmouseover="triggerLineHotspot(95);" onmouseout="untriggerLineHotspot(95);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(95); return false;"><img id="lnhs-95" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="95"></a><br/><a name="96"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="97"></a><a name="98"></a><a name="99"></a> Gets the list of added test cases so far
 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Returns:</span></dt><dd>a list of <code><code><a href='/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/TestCase.java#TestCase' title='junit.framework.TestCase'>junit.framework.TestCase</a></code></code></dd></dl></div></div></div><div class="line" id="line-100"><div class="lnml" id="lnml-100"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(100);" onmouseout="untriggerLineHotspot(100);"><pre><a name="100" href="#100">100</a></pre></div><div class="lnmr" id="lnmr-100" onmouseover="triggerLineHotspot(100);" onmouseout="untriggerLineHotspot(100);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(100); return false;"><img id="lnhs-100" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-101"><div class="lnml" id="lnml-101"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(101);" onmouseout="untriggerLineHotspot(101);"><pre><a name="101" href="#101">101</a></pre></div><div class="lnmr" id="lnmr-101" onmouseover="triggerLineHotspot(101);" onmouseout="untriggerLineHotspot(101);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(101); return false;"><img id="lnhs-101" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/List.java#List" title="java.util.List">List</a>&lt;<a href="/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/TestCase.java#TestCase" title="junit.framework.TestCase">TestCase</a>>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@getTestCases()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.getTestCases%28%29">getTestCases</a>()&nbsp;{</pre></div><div class="line" id="line-102"><div class="lnml" id="lnml-102"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(102);" onmouseout="untriggerLineHotspot(102);"><pre><a name="102" href="#102">102</a></pre></div><div class="lnmr" id="lnmr-102" onmouseover="triggerLineHotspot(102);" onmouseout="untriggerLineHotspot(102);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(102); return false;"><img id="lnhs-102" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;Collections.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/Collections.java#Collections.unmodifiableList%28java.util.List%29" title="java.util.Collections.unmodifiableList(java.util.List) : List">unmodifiableList</a>(<span class="mark-1#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mTestCases" title="List mTestCases" class="hidden">mTestCases</a></span>);</pre></div><div class="line" id="line-103"><div class="lnml" id="lnml-103"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(103);" onmouseout="untriggerLineHotspot(103);"><pre><a name="103" href="#103">103</a></pre></div><div class="lnmr" id="lnmr-103" onmouseover="triggerLineHotspot(103);" onmouseout="untriggerLineHotspot(103);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(103); return false;"><img id="lnhs-103" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-104"><div class="lnml" id="lnml-104"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(104);" onmouseout="untriggerLineHotspot(104);"><pre><a name="104" href="#104">104</a></pre></div><div class="lnmr" id="lnmr-104" onmouseover="triggerLineHotspot(104);" onmouseout="untriggerLineHotspot(104);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(104); return false;"><img id="lnhs-104" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-105"><div class="lnml" id="lnml-105"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(105);" onmouseout="untriggerLineHotspot(105);"><pre><a name="105" href="#105">105</a></pre></div><div class="lnmr" id="lnmr-105" onmouseover="triggerLineHotspot(105);" onmouseout="untriggerLineHotspot(105);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(105); return false;"><img id="lnhs-105" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">protected</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addSingleTestMethod(java.lang.Class,java.lang.String)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.addSingleTestMethod%28java.lang.Class%2Cjava.lang.String%29">addSingleTestMethod</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class" title="java.lang.Class">Class</a>&lt;?>&nbsp;<span class="mark-15#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>,&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>&nbsp;<span class="mark-16#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">method</span>)&nbsp;{</pre></div><div class="line" id="line-106"><div class="lnml" id="lnml-106"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(106);" onmouseout="untriggerLineHotspot(106);"><pre><a name="106" href="#106">106</a></pre></div><div class="lnmr" id="lnmr-106" onmouseover="triggerLineHotspot(106);" onmouseout="untriggerLineHotspot(106);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(106); return false;"><img id="lnhs-106" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(!(<span class="mark-2#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mFilter" title="TestCaseFilter mFilter" class="hidden">mFilter</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.TestCaseFilter.accept%28java.lang.Class%29" title="com.android.uiautomator.testrunner.TestCaseCollector.TestCaseFilter.accept(java.lang.Class) : boolean">accept</a>(<span class="mark-15#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>)))&nbsp;{</pre></div><div class="line" id="line-107"><div class="lnml" id="lnml-107"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(107);" onmouseout="untriggerLineHotspot(107);"><pre><a name="107" href="#107">107</a></pre></div><div class="lnmr" id="lnmr-107" onmouseover="triggerLineHotspot(107);" onmouseout="untriggerLineHotspot(107);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(107); return false;"><img id="lnhs-107" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">throw</span>&nbsp;<span class="kw">new</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/RuntimeException.java#RuntimeException" title="java.lang.RuntimeException">RuntimeException</a>(<span class="strliteral">"Test&nbsp;class&nbsp;must&nbsp;be&nbsp;derived&nbsp;from&nbsp;UiAutomatorTestCase"</span>);</pre></div><div class="line" id="line-108"><div class="lnml" id="lnml-108"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(108);" onmouseout="untriggerLineHotspot(108);"><pre><a name="108" href="#108">108</a></pre></div><div class="lnmr" id="lnmr-108" onmouseover="triggerLineHotspot(108);" onmouseout="untriggerLineHotspot(108);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(108); return false;"><img id="lnhs-108" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-109"><div class="lnml" id="lnml-109"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(109);" onmouseout="untriggerLineHotspot(109);"><pre><a name="109" href="#109">109</a></pre></div><div class="lnmr" id="lnmr-109" onmouseover="triggerLineHotspot(109);" onmouseout="untriggerLineHotspot(109);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(109); return false;"><img id="lnhs-109" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">try</span>&nbsp;{</pre></div><div class="line" id="line-110"><div class="lnml" id="lnml-110"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(110);" onmouseout="untriggerLineHotspot(110);"><pre><a name="110" href="#110">110</a></pre></div><div class="lnmr" id="lnmr-110" onmouseover="triggerLineHotspot(110);" onmouseout="untriggerLineHotspot(110);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(110); return false;"><img id="lnhs-110" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/TestCase.java#TestCase" title="junit.framework.TestCase">TestCase</a>&nbsp;<span class="mark-17#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">testCase</span>&nbsp;=&nbsp;(<a href="/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/TestCase.java#TestCase" title="junit.framework.TestCase">TestCase</a>)&nbsp;<span class="mark-15#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class.newInstance%28%29" title="java.lang.Class.newInstance() : capture#">newInstance</a>();</pre></div><div class="line" id="line-111"><div class="lnml" id="lnml-111"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(111);" onmouseout="untriggerLineHotspot(111);"><pre><a name="111" href="#111">111</a></pre></div><div class="lnmr" id="lnmr-111" onmouseover="triggerLineHotspot(111);" onmouseout="untriggerLineHotspot(111);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(111); return false;"><img id="lnhs-111" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-17#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">testCase</span>.<a href="/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/TestCase.java#TestCase.setName%28java.lang.String%29" title="junit.framework.TestCase.setName(java.lang.String) : void">setName</a>(<span class="mark-16#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">method</span>);</pre></div><div class="line" id="line-112"><div class="lnml" id="lnml-112"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(112);" onmouseout="untriggerLineHotspot(112);"><pre><a name="112" href="#112">112</a></pre></div><div class="lnmr" id="lnmr-112" onmouseover="triggerLineHotspot(112);" onmouseout="untriggerLineHotspot(112);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(112); return false;"><img id="lnhs-112" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-1#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mTestCases" title="List mTestCases" class="hidden">mTestCases</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/List.java#List.add%28junit.framework.TestCase%29" title="java.util.List.add(junit.framework.TestCase) : boolean">add</a>(<span class="mark-17#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">testCase</span>);</pre></div><div class="line" id="line-113"><div class="lnml" id="lnml-113"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(113);" onmouseout="untriggerLineHotspot(113);"><pre><a name="113" href="#113">113</a></pre></div><div class="lnmr" id="lnmr-113" onmouseover="triggerLineHotspot(113);" onmouseout="untriggerLineHotspot(113);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(113); return false;"><img id="lnhs-113" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">catch</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/InstantiationException.java#InstantiationException" title="java.lang.InstantiationException">InstantiationException</a>&nbsp;<span class="mark-18#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">e</span>)&nbsp;{</pre></div><div class="line" id="line-114"><div class="lnml" id="lnml-114"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(114);" onmouseout="untriggerLineHotspot(114);"><pre><a name="114" href="#114">114</a></pre></div><div class="lnmr" id="lnmr-114" onmouseover="triggerLineHotspot(114);" onmouseout="untriggerLineHotspot(114);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(114); return false;"><img id="lnhs-114" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-1#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mTestCases" title="List mTestCases" class="hidden">mTestCases</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/List.java#List.add%28junit.framework.TestCase%29" title="java.util.List.add(junit.framework.TestCase) : boolean">add</a>(<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.error%28java.lang.Class%2Cjava.lang.String%29" title="com.android.uiautomator.testrunner.TestCaseCollector.error(java.lang.Class,java.lang.String) : UiAutomatorTestCase">error</a>(<span class="mark-15#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>,&nbsp;<span class="strliteral">"InstantiationException:&nbsp;could&nbsp;not&nbsp;instantiate&nbsp;"</span>&nbsp;+</pre></div><div class="line" id="line-115"><div class="lnml" id="lnml-115"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(115);" onmouseout="untriggerLineHotspot(115);"><pre><a name="115" href="#115">115</a></pre></div><div class="lnmr" id="lnmr-115" onmouseover="triggerLineHotspot(115);" onmouseout="untriggerLineHotspot(115);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(115); return false;"><img id="lnhs-115" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="strliteral">"test&nbsp;class.&nbsp;Class:&nbsp;"</span>&nbsp;+&nbsp;<span class="mark-15#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class.getName%28%29" title="java.lang.Class.getName() : String">getName</a>()));</pre></div><div class="line" id="line-116"><div class="lnml" id="lnml-116"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(116);" onmouseout="untriggerLineHotspot(116);"><pre><a name="116" href="#116">116</a></pre></div><div class="lnmr" id="lnmr-116" onmouseover="triggerLineHotspot(116);" onmouseout="untriggerLineHotspot(116);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(116); return false;"><img id="lnhs-116" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">catch</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/IllegalAccessException.java#IllegalAccessException" title="java.lang.IllegalAccessException">IllegalAccessException</a>&nbsp;<span class="mark-19#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">e</span>)&nbsp;{</pre></div><div class="line" id="line-117"><div class="lnml" id="lnml-117"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(117);" onmouseout="untriggerLineHotspot(117);"><pre><a name="117" href="#117">117</a></pre></div><div class="lnmr" id="lnmr-117" onmouseover="triggerLineHotspot(117);" onmouseout="untriggerLineHotspot(117);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(117); return false;"><img id="lnhs-117" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-1#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mTestCases" title="List mTestCases" class="hidden">mTestCases</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/List.java#List.add%28junit.framework.TestCase%29" title="java.util.List.add(junit.framework.TestCase) : boolean">add</a>(<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.error%28java.lang.Class%2Cjava.lang.String%29" title="com.android.uiautomator.testrunner.TestCaseCollector.error(java.lang.Class,java.lang.String) : UiAutomatorTestCase">error</a>(<span class="mark-15#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>,&nbsp;<span class="strliteral">"IllegalAccessException:&nbsp;could&nbsp;not&nbsp;instantiate&nbsp;"</span>&nbsp;+</pre></div><div class="line" id="line-118"><div class="lnml" id="lnml-118"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(118);" onmouseout="untriggerLineHotspot(118);"><pre><a name="118" href="#118">118</a></pre></div><div class="lnmr" id="lnmr-118" onmouseover="triggerLineHotspot(118);" onmouseout="untriggerLineHotspot(118);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(118); return false;"><img id="lnhs-118" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="strliteral">"test&nbsp;class.&nbsp;Class:&nbsp;"</span>&nbsp;+&nbsp;<span class="mark-15#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class.getName%28%29" title="java.lang.Class.getName() : String">getName</a>()));</pre></div><div class="line" id="line-119"><div class="lnml" id="lnml-119"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(119);" onmouseout="untriggerLineHotspot(119);"><pre><a name="119" href="#119">119</a></pre></div><div class="lnmr" id="lnmr-119" onmouseover="triggerLineHotspot(119);" onmouseout="untriggerLineHotspot(119);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(119); return false;"><img id="lnhs-119" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-120"><div class="lnml" id="lnml-120"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(120);" onmouseout="untriggerLineHotspot(120);"><pre><a name="120" href="#120">120</a></pre></div><div class="lnmr" id="lnmr-120" onmouseover="triggerLineHotspot(120);" onmouseout="untriggerLineHotspot(120);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(120); return false;"><img id="lnhs-120" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-121"><div class="lnml" id="lnml-121"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(121);" onmouseout="untriggerLineHotspot(121);"><pre><a name="121" href="#121">121</a></pre></div><div class="lnmr" id="lnmr-121" onmouseover="triggerLineHotspot(121);" onmouseout="untriggerLineHotspot(121);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(121); return false;"><img id="lnhs-121" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-122"><div class="lnml" id="lnml-122"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(122);" onmouseout="untriggerLineHotspot(122);"><pre><a name="122" href="#122">122</a></pre></div><div class="lnmr" id="lnmr-122" onmouseover="triggerLineHotspot(122);" onmouseout="untriggerLineHotspot(122);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(122); return false;"><img id="lnhs-122" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/UiAutomatorTestCase.java#UiAutomatorTestCase" title="com.android.uiautomator.testrunner.UiAutomatorTestCase">UiAutomatorTestCase</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@error(java.lang.Class,java.lang.String)',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.error%28java.lang.Class%2Cjava.lang.String%29">error</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class" title="java.lang.Class">Class</a>&lt;?>&nbsp;<span class="mark-20#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>,&nbsp;<span class="kw">final</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>&nbsp;<span class="mark-21#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">message</span>)&nbsp;{</pre></div><div class="line" id="line-123"><div class="lnml" id="lnml-123"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(123);" onmouseout="untriggerLineHotspot(123);"><pre><a name="123" href="#123">123</a></pre></div><div class="lnmr" id="lnmr-123" onmouseover="triggerLineHotspot(123);" onmouseout="untriggerLineHotspot(123);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(123); return false;"><img id="lnhs-123" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/UiAutomatorTestCase.java#UiAutomatorTestCase" title="com.android.uiautomator.testrunner.UiAutomatorTestCase">UiAutomatorTestCase</a>&nbsp;<span class="mark-22#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">warning</span>&nbsp;=&nbsp;<span class="kw">new</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/UiAutomatorTestCase.java#UiAutomatorTestCase" title="com.android.uiautomator.testrunner.UiAutomatorTestCase">UiAutomatorTestCase</a>()&nbsp;{</pre></div><div class="line" id="line-124"><div class="lnml" id="lnml-124"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(124);" onmouseout="untriggerLineHotspot(124);"><pre><a name="124" href="#124">124</a></pre></div><div class="lnmr" id="lnmr-124" onmouseover="triggerLineHotspot(124);" onmouseout="untriggerLineHotspot(124);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(124); return false;"><img id="lnhs-124" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">protected</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@new UiAutomatorTestCase(){}@runTest()',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="new+UiAutomatorTestCase%28%29%7B%7D.runTest%28%29">runTest</a>()&nbsp;{</pre></div><div class="line" id="line-125"><div class="lnml" id="lnml-125"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(125);" onmouseout="untriggerLineHotspot(125);"><pre><a name="125" href="#125">125</a></pre></div><div class="lnmr" id="lnmr-125" onmouseover="triggerLineHotspot(125);" onmouseout="untriggerLineHotspot(125);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(125); return false;"><img id="lnhs-125" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/Assert.java#Assert.fail%28java.lang.String%29" title="junit.framework.Assert.fail(java.lang.String) : void">fail</a>(<span class="mark-21#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">message</span>);</pre></div><div class="line" id="line-126"><div class="lnml" id="lnml-126"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(126);" onmouseout="untriggerLineHotspot(126);"><pre><a name="126" href="#126">126</a></pre></div><div class="lnmr" id="lnmr-126" onmouseover="triggerLineHotspot(126);" onmouseout="untriggerLineHotspot(126);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(126); return false;"><img id="lnhs-126" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-127"><div class="lnml" id="lnml-127"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(127);" onmouseout="untriggerLineHotspot(127);"><pre><a name="127" href="#127">127</a></pre></div><div class="lnmr" id="lnmr-127" onmouseover="triggerLineHotspot(127);" onmouseout="untriggerLineHotspot(127);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(127); return false;"><img id="lnhs-127" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;};</pre></div><div class="line" id="line-128"><div class="lnml" id="lnml-128"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(128);" onmouseout="untriggerLineHotspot(128);"><pre><a name="128" href="#128">128</a></pre></div><div class="lnmr" id="lnmr-128" onmouseover="triggerLineHotspot(128);" onmouseout="untriggerLineHotspot(128);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(128); return false;"><img id="lnhs-128" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-129"><div class="lnml" id="lnml-129"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(129);" onmouseout="untriggerLineHotspot(129);"><pre><a name="129" href="#129">129</a></pre></div><div class="lnmr" id="lnmr-129" onmouseover="triggerLineHotspot(129);" onmouseout="untriggerLineHotspot(129);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(129); return false;"><img id="lnhs-129" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-22#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">warning</span>.<a href="/file/repo1.maven.org/maven2/junit/junit/3.8.2/junit/framework/TestCase.java#TestCase.setName%28java.lang.String%29" title="junit.framework.TestCase.setName(java.lang.String) : void">setName</a>(<span class="mark-20#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class.getName%28%29" title="java.lang.Class.getName() : String">getName</a>());</pre></div><div class="line" id="line-130"><div class="lnml" id="lnml-130"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(130);" onmouseout="untriggerLineHotspot(130);"><pre><a name="130" href="#130">130</a></pre></div><div class="lnmr" id="lnmr-130" onmouseover="triggerLineHotspot(130);" onmouseout="untriggerLineHotspot(130);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(130); return false;"><img id="lnhs-130" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-22#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">warning</span>;</pre></div><div class="line" id="line-131"><div class="lnml" id="lnml-131"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(131);" onmouseout="untriggerLineHotspot(131);"><pre><a name="131" href="#131">131</a></pre></div><div class="lnmr" id="lnmr-131" onmouseover="triggerLineHotspot(131);" onmouseout="untriggerLineHotspot(131);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(131); return false;"><img id="lnhs-131" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="131"></a><br/><a name="132"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="133"></a><a name="134"></a><a name="135"></a> Determine if a class and its method should be accepted into test suite

 </div></div><div class="line" id="line-136"><div class="lnml" id="lnml-136"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(136);" onmouseout="untriggerLineHotspot(136);"><pre><a name="136" href="#136">136</a></pre></div><div class="lnmr" id="lnmr-136" onmouseover="triggerLineHotspot(136);" onmouseout="untriggerLineHotspot(136);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(136); return false;"><img id="lnhs-136" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-137"><div class="lnml" id="lnml-137"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(137);" onmouseout="untriggerLineHotspot(137);"><pre><a name="137" href="#137">137</a></pre></div><div class="lnmr" id="lnmr-137" onmouseover="triggerLineHotspot(137);" onmouseout="untriggerLineHotspot(137);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(137); return false;"><img id="lnhs-137" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">interface</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'type','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector.TestCaseFilter',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.TestCaseFilter">TestCaseFilter</a>&nbsp;{<br/><a name="137"></a><br/><a name="138"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="139"></a><a name="140"></a><a name="141"></a> Determine that based on the method signature, if it can be accepted
 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>method</code></dd></dl></div></div></div><div class="line" id="line-142"><div class="lnml" id="lnml-142"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(142);" onmouseout="untriggerLineHotspot(142);"><pre><a name="142" href="#142">142</a></pre></div><div class="lnmr" id="lnmr-142" onmouseover="triggerLineHotspot(142);" onmouseout="untriggerLineHotspot(142);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(142); return false;"><img id="lnhs-142" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-143"><div class="lnml" id="lnml-143"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(143);" onmouseout="untriggerLineHotspot(143);"><pre><a name="143" href="#143">143</a></pre></div><div class="lnmr" id="lnmr-143" onmouseover="triggerLineHotspot(143);" onmouseout="untriggerLineHotspot(143);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(143); return false;"><img id="lnhs-143" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">boolean</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector.TestCaseFilter@accept(java.lang.reflect.Method)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.TestCaseFilter.accept%28java.lang.reflect.Method%29">accept</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/reflect/Method.java#Method" title="java.lang.reflect.Method">Method</a>&nbsp;<span class="mark-23#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">method</span>);<br/><a name="143"></a><br/><a name="144"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="145"></a><a name="146"></a><a name="147"></a><a name="148"></a> Determine that based on the class type, if it can be accepted
 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>clazz</code></dd><dt><span class="javadoc-key"> Returns:</span></dt><dd></dd></dl></div></div></div><div class="line" id="line-149"><div class="lnml" id="lnml-149"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(149);" onmouseout="untriggerLineHotspot(149);"><pre><a name="149" href="#149">149</a></pre></div><div class="lnmr" id="lnmr-149" onmouseover="triggerLineHotspot(149);" onmouseout="untriggerLineHotspot(149);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(149); return false;"><img id="lnhs-149" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-150"><div class="lnml" id="lnml-150"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(150);" onmouseout="untriggerLineHotspot(150);"><pre><a name="150" href="#150">150</a></pre></div><div class="lnmr" id="lnmr-150" onmouseover="triggerLineHotspot(150);" onmouseout="untriggerLineHotspot(150);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(150); return false;"><img id="lnhs-150" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">boolean</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector.TestCaseFilter@accept(java.lang.Class)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="TestCaseCollector.TestCaseFilter.accept%28java.lang.Class%29">accept</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class" title="java.lang.Class">Class</a>&lt;?>&nbsp;<span class="mark-24#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">clazz</span>);</pre></div><div class="line" id="line-151"><div class="lnml" id="lnml-151"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(151);" onmouseout="untriggerLineHotspot(151);"><pre><a name="151" href="#151">151</a></pre></div><div class="lnmr" id="lnmr-151" onmouseover="triggerLineHotspot(151);" onmouseout="untriggerLineHotspot(151);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(151); return false;"><img id="lnhs-151" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-152"><div class="lnml" id="lnml-152"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(152);" onmouseout="untriggerLineHotspot(152);"><pre><a name="152" href="#152">152</a></pre></div><div class="lnmr" id="lnmr-152" onmouseover="triggerLineHotspot(152);" onmouseout="untriggerLineHotspot(152);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(152); return false;"><img id="lnhs-152" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>}<br/><a name="152"></a></pre></div>
</div>
</div>
</div>
                <div id='entity-decl-context-menu' class='context-menu-panel' style='visibility: hidden;'></div>
                <div id='entity-decl-context-menu-data' style='visibility: hidden;'></div>

                <div id="bug-popup-div" class="bug-popup" style="visibility: hidden;">
                    <span id="bug-message-span"></span>
                </div>

                
                
                <div id="ad-container">
                    <script>
                    function findPre(el) {
                        var children = el.childNodes;
                        for(var i = 0; i < children.length; ++i) {
                            var c = children[i];
                            if (c.tagName == "PRE") {
                                return c;
                            }
                        }
                        return null;
                    }

                    function getLines() {
                        if (document.getElementsByClassName) {
                        	return document.getElementsByClassName("line");
                        } else {
                            var lines = new Array();
                            divs = document.getElementsByTagName("div");
                            for(var i = 0; i < divs.length; ++i) {
                                if (divs[i].className == "line") {
                                    lines[lines.length] = divs[i];
                                }
                            }
                            return lines;
                        }
                    }

                    function findContigousAdSpace() {
                        var lineElems = getLines();
                        var regions = new Array();
                        var inRegion = false;
                        var lastLine = -1;
                        var currRegion = null;
                        for(var i = 0; i < lineElems.length; ++i) {
                            var d = lineElems[i];
                            var did = d.id;
                            if (!did || !did.substr(0, 5) == "line-") {
                                continue;
                            }
                            var line = parseInt(did.substr(5));
                            var pre = findPre(d);
                            if (lastLine + 1 == line) {
                                if (pre) {
                                    currRegion.xEnd = currRegion.xEnd < pre.offsetWidth ? pre.offsetWidth : currRegion.xEnd;
                                    currRegion.yEnd = getPageOffsetBottom(pre) - getPageOffsetTop(document.getElementById('source-view'));
                                }
                            } else {
                                if (currRegion) {
                                    regions[regions.length] = currRegion;
                                }
                                if (pre) {
                                    currRegion = { };
                                    currRegion.xEnd = pre.offsetWidth;
                                    currRegion.yBegin = getPageOffsetTop(pre) - getPageOffsetTop(document.getElementById('source-view'));
                                }
                            }
                            lastLine = line;
                        }
                        if (currRegion) {
                            regions[regions.length] = currRegion;
                        }
                        return regions;
                    }

                    function show160x600Ad(divWidth, region) {
                        var j = region.yBegin + 20;
                        if (j + 600 < region.yEnd) {
                            if (region.xEnd > divWidth - 200) {
                                return false;
                            }
                            document.write('<div style="position: absolute; right: 0px; top: ' + j + 'px; z-index: 2; width: 185px; height: 610px"><div style="position: relative;">'
                                    + get160x600Ad()
                                    + '</div></div>');
                            region.yBegin = j + 600;
                            return true;
                        }
                        return false;
                    }
                    
                    function show120x240Ad(divWidth, region) {
                        var j = region.yBegin + 20;
                        if (j + 240 < region.yEnd) {
                            if (region.xEnd > divWidth - 200) {
                                return false;
                            }
                            document.write('<div style="position: absolute; right: 0px; top: ' + j + 'px; z-index: 2; width: 145px; height: 250px"><div style="position: relative;">'
                                    + get120x240Ad()
                                    + '</div></div>');
                            region.yBegin = j + 240;
                            return true;
                        }
                        return false;
                    }

                    function show160x90LinkUnitAd(divWidth, region) {
                        var j = region.yBegin + 20;
                        if (j + 90 < region.yEnd) {
                            if (region.xEnd > divWidth - 200) {
                                return false;
                            }
                            document.write('<div style="position: absolute; right: 0px; top: ' + j + 'px; z-index: 2; width: 185px; height: 100px"><div style="position: relative;">'
                                    + get160x90LinkUnitAd()
                                    + '</div></div>');
                            region.yBegin = j + 90;
                            return true;
                        }
                        return false;
                    }

                    function showAds() {
                        var units = [[ show160x600Ad, show120x240Ad ], [ show160x90LinkUnitAd ]]
                        var regions = findContigousAdSpace();
                        var num = 0;
                        var divWidth = getPageOffsetRight(document.getElementById('source-view')) - getPageOffsetLeft(document.getElementById('source-view'));
                        for(var unit = 0; unit < units.length; ++unit) {
                            var ads = units[unit];
                            var num = 0;
                            var maxNAds = 3;
                            for(var a = 0; a < ads.length; ++a) {
                                if (num >= maxNAds) {
                                    break;
                                }
                                for(var i = 0; i < regions.length; ++i) {
                                    if (num >= maxNAds) {
                                        break;
                                    }
                                    while(true) {
                                        if (num >= maxNAds) {
                                            break;
                                        }
                                        if (!ads[a](divWidth, regions[i])) {
                                            break;
                                        }
                                        ++num;
                                    }
                                }
                            }
                        }
                    }
                    if (!isBrowserMSIE()) {
                        showAds();
                    }
                    </script>
                </div>
                
            </div>
        </div>
    </div>
    <div style="display: none;" id="outline-view-div">
        <div class="outline-header">
            <form name="profileform">
            <label for="profile">Profile: </label>
            <select name="profile" onchange="setProfile(this.value);" id="profilechanger">
                <option value="jre">Standard JRE</option>
                <option value="gae">Google AppEngine</option>
            </select>
            </form>
        </div>
        <div><div class='outline'>
<img class='img_base img_jdt_obj16_package_obj' src='/static/app/images/1x1.gif' border='0' title='Package' width='16' height='16'></img>&nbsp;<span class="code">com.android.uiautomator.testrunner</span><br/>
<img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:3px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector" title="public class TestCaseCollector"><span class="code">TestCaseCollector</span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector"></div><br/>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_constr_ovr' src='/static/app/images/1x1.gif' border='0' title='Constructor' width='7' height='8'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.%3Cinit%3E%28java.lang.ClassLoader%2Ccom.android.uiautomator.testrunner.TestCaseCollector.TestCaseFilter%29" title="public void TestCaseCollector(ClassLoader, TestCaseCollector.TestCaseFilter)"><span class="code">TestCaseCollector(ClassLoader, TestCaseCollector.TestCaseFilter)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@<init>(java.lang.ClassLoader,com.android.uiautomator.testrunner.TestCaseCollector.TestCaseFilter)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_protected_co' src='/static/app/images/1x1.gif' border='0' title='Protected Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.addSingleTestMethod%28java.lang.Class%2Cjava.lang.String%29" title="protected void addSingleTestMethod(Class&lt;?&gt;, String)"><span class="code">addSingleTestMethod(Class, String)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addSingleTestMethod(java.lang.Class,java.lang.String)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.addTestClass%28java.lang.String%29" title="public void addTestClass(String)"><span class="code">addTestClass(String)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addTestClass(java.lang.String)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.addTestClass%28java.lang.String%2Cjava.lang.String%29" title="public void addTestClass(String, String)"><span class="code">addTestClass(String, String)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addTestClass(java.lang.String,java.lang.String)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.addTestClasses%28java.util.List%29" title="public void addTestClasses(List&lt;String&gt;)"><span class="code">addTestClasses(List)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addTestClasses(java.util.List)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_private_co' src='/static/app/images/1x1.gif' border='0' title='Private Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.error%28java.lang.Class%2Cjava.lang.String%29" title="private UiAutomatorTestCase error(Class&lt;?&gt;, String)"><span class="code">error(Class, String)<span class="returnType"> : UiAutomatorTestCase</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@error(java.lang.Class,java.lang.String)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.getTestCases%28%29" title="public List&lt;TestCase&gt; getTestCases()"><span class="code">getTestCases()<span class="returnType"> : List&lt;TestCase&gt;</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@getTestCases()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mClassLoader" title="private ClassLoader mClassLoader"><span class="code">mClassLoader : <span class="returnType">ClassLoader</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mFilter" title="private TestCaseCollector.TestCaseFilter mFilter"><span class="code">mFilter : <span class="returnType">TestCaseCollector.TestCaseFilter</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.0mTestCases" title="private List&lt;TestCase&gt; mTestCases"><span class="code">mTestCases : <span class="returnType">List&lt;TestCase&gt;</span></span></a><br/></nobr>
<img class='img_base img_jdt_obj16_int_obj' src='/static/app/images/1x1.gif' border='0' title='Interface' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:3px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.TestCaseFilter" title="public interface TestCaseCollector.TestCaseFilter"><span class="code">TestCaseFilter in TestCaseCollector</span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector.TestCaseFilter"></div><br/>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.TestCaseFilter.accept%28java.lang.Class%29" title="public boolean accept(Class&lt;?&gt;)"><span class="code">accept(Class)<span class="returnType"> : boolean</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector.TestCaseFilter@accept(java.lang.Class)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java#TestCaseCollector.TestCaseFilter.accept%28java.lang.reflect.Method%29" title="public boolean accept(Method)"><span class="code">accept(Method)<span class="returnType"> : boolean</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector.TestCaseFilter@accept(java.lang.reflect.Method)"></div><br/></nobr>
</div>
</div>
    </div>
    <div style="display: none;" id="th-view-div">
        <div><div class="type-hierarchy">
<img class='img_base img_jdt_ovr16_focus_ovr' src='/static/app/images/1x1.gif' border='0' title='Focus' width='4' height='10'></img><img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><span class='whitespace'>.</span><b><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java?av=h#TestCaseCollector" title="in GrepCode / com.google.android / android / 4.4.4_r1"><span class="code">TestCaseCollector</span></a></b><br/>
</div>
<hr/>
<div class="type-hierarchy">
<img class='img_base img_jdt_ovr16_focus_ovr' src='/static/app/images/1x1.gif' border='0' title='Focus' width='4' height='10'></img><img class='img_base img_jdt_obj16_int_obj' src='/static/app/images/1x1.gif' border='0' title='Interface' width='16' height='16'></img><span class='whitespace'>.</span><b><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/TestCaseCollector.java?av=h#TestCaseCollector.TestCaseFilter" title="in GrepCode / com.google.android / android / 4.4.4_r1"><span class="code">TestCaseFilter in TestCaseCollector</span></a></b><br/>
<span class='whitespace'>...</span><span class='whitespace'>...</span><img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><span class='whitespace'>.</span><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/testrunner/UiAutomatorTestCaseFilter.java?av=h#UiAutomatorTestCaseFilter" title="in GrepCode / com.google.android / android / 4.4.4_r1"><span class="code">com.android.uiautomator.testrunner.UiAutomatorTestCaseFilter</span></a><br/>
</div>
</div>
    </div>
    <script type="text/javascript">pageTracker._setCustomVar(1, 'p-uri', 'http://source.android.com', 3);</script>
    <script>
    function render(msgPre, evidenceId, currentId) {
        var currentParts = currentId.split("@");
        if (evidenceId == "") {
            return currentParts.length == 5 ? (msgPre + " as indicated by Google AppEngine Whitelist") : "";
        }
        var parts = evidenceId.split("@");
        if (parts.length == 5) {
            var prefix = "Uses";
            if (currentParts[3] == parts[3] && (currentParts[4] + ".").substring(0, parts[4].length + 1) == (parts[4] + ".")) {
                prefix = "Contained in";
            }
            return prefix + " type " + (parts[3] + "." + parts[4]).replace(/\$/g, ".");
        } else if (parts.length == 6) {
            return "Uses method " + parts[5] + " in type " + (parts[3] + "." + parts[4]).replace("$", ".");            
        }
        return "";
    }
    
    function doProfileRegistration(event, dummy, data) {
        var gaepc = data[0];

        for(i = 0; i < gaepc[2].length; ++i) {
            var m = gaepc[2][i];
            if (m.length >= 3) {
                var div = document.getElementById("gae-status-" + m[0]);
                if (div) {
                    if ("NONE" == m[1]) {
                        div.innerHTML = "<img class='img_base img_jdt_obj16_never_translate' src='/static/app/images/1x1.gif' border='0' title='"+ render("No support", m[2], m[0]) + "' width='16' height='16'></img>";
                    } else if ("PARTIAL" == m[1]) {
                        div.innerHTML = "<img class='img_base img_jdt_obj16_warning_obj' src='/static/app/images/1x1.gif' border='0' title='"+ render("Partial support", m[2], m[0]) + "' width='16' height='16'></img>";
                    }
                }
            }
        }
    }

    function registerProfileCompatibility(data) {
        YAHOO.util.Event.onDOMReady(doProfileRegistration, data);
    }

    function setInitialProfile() {
        var profileId = getRequestParameter('pr');
        var profileChooser = document.getElementById("profilechanger");

        if (profileChooser != null) {
            var options = profileChooser.options;
            for (var i=0; i<options.length; i=i+1) {
                if (options[i].value == profileId) {
                    options[i].selected = true;
                    setProfile(profileId);
                    return;
                }
            }
        }
    }

    function setProfile(value) {
        if ("gae" == value) {
            var el = YAHOO.util.Dom.getElementsByClassName("gae-status");            
            YAHOO.util.Dom.replaceClass(el, "gae-status", "gae-status-enabled");            
        } else {
            el = YAHOO.util.Dom.getElementsByClassName("gae-status-enabled");
            YAHOO.util.Dom.replaceClass(el, "gae-status-enabled", "gae-status");            
        }
    }

    var markElement = null;
    var scheduledMarkId = null;

    function scheduleMark(el) {
        if (scheduledMarkId != null) {
            unscheduleMark(null)
        }
        markElement = el;
        scheduledMarkId = setInterval("mark(markElement);", 500);
    }

    function unscheduleMark(el) {
        if (scheduledMarkId != null) {
            clearInterval(scheduledMarkId);
            scheduledMarkId = null;
        }
    }

    function mark(el) {
        var classAttribute = getClassAttribute(el);
        var weight = getWeight(classAttribute);
        if (weight == "0") {
            el.style.background = "#fb8";
        }
        else {
            el.style.background = "#ddd";
        }
    
        var markWithoutWeight = removeWeight(classAttribute);
    
        var spanElems = document.getElementsByTagName("span");
        for (i = 0; i < spanElems.length; i++) {        
            var spanClassAttribute = getClassAttribute(spanElems[i]);
            if (spanClassAttribute && isMark(spanClassAttribute)) {
                if (markWithoutWeight == removeWeight(spanClassAttribute)) {            
                    var spanWeight = getWeight(spanClassAttribute);
                    if (spanWeight == "0") {
                        spanElems[i].style.background = "#fb8";
                    }
                    else {
                        spanElems[i].style.background = "#ddd";
                    }
                }
                else {
                    spanElems[i].style.background = "";
                }       
            }   
        }    
    }

    function demark(el) {
        el.style.background = "white";
        var spanElems = document.getElementsByTagName("span");
        for (i = 0; i < spanElems.length; i++) {
            if (getClassAttribute(el) == getClassAttribute(spanElems[i])) {
                spanElems[i].style.background = ""; 
            }
        }
    }

    function removeWeight(s) {
        return s.substring(0, s.indexOf('#'));
    }

    function getWeight(s) {
        return s.substring(s.indexOf('#')+1);
    }

    function isMark(s) {
        return (s.length > 5) && (s.substring(0, 5) == "mark-");
    }
    </script>
    <div style="display: none;" id="pc-div">
        <div><script language="javascript">registerProfileCompatibility([["gae","Google AppEngine",[["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@<init>(java.lang.ClassLoader,com.android.uiautomator.testrunner.TestCaseCollector.TestCaseFilter)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addSingleTestMethod(java.lang.Class,java.lang.String)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addTestClass(java.lang.String)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addTestClass(java.lang.String,java.lang.String)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@addTestClasses(java.util.List)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@error(java.lang.Class,java.lang.String)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector@getTestCases()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector","NONE","!1j@!1l@!k1@com$android$uiautomator$testrunner@UiAutomatorTestCase"],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector.TestCaseFilter@accept(java.lang.Class)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector.TestCaseFilter@accept(java.lang.reflect.Method)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$testrunner@TestCaseCollector.TestCaseFilter","NONE","!1j@!1l@!k1@com$android$uiautomator$testrunner@TestCaseCollector"],[]]]])</script></div>
    </div>

    <script>
    var bugPopUpOn = -1;
    var bugs = [];

    function showbug(marker, index) {
        var bugPopupDiv = document.getElementById('bug-popup-div');
        var bugMsgSpan = document.getElementById('bug-message-span');
        var startIndex = index - 1;
        while(startIndex >= 0 && bugs[startIndex].sl == bugs[index].sl) {
            --startIndex;
        }
        ++startIndex;
        var str = '';
        for(var i = startIndex; i <= index; ++i) {
            var bug = bugs[i];
            if (bug.el > 0 && bug.el != bug.sl) {
                str += 'Lines ' + bug.sl + '-' + bug.el;
            } else {
                str += 'Line ' + bug.sl;
            }
            str += ': ' + bug.m + '<br/>';
        }
        bugMsgSpan.innerHTML = str;
        bugPopupDiv.style.left = (marker.offsetLeft + 20) + 'px';
        bugPopupDiv.style.top = (marker.offsetTop + 20) + 'px';
        bugPopupDiv.style.visibility = 'visible';        
    }

    function hidebug() {
        var bugPopupDiv = document.getElementById('bug-popup-div');
        bugPopupDiv.style.visibility = 'hidden';
    }

    function cmpBugs(b1, b2) {
        return b1.sl - b2.sl;
    }

    function showBugs() {
        bugs = eval(document.getElementById('bugs').innerHTML).sort(cmpBugs);
        for (var i=0, ln=bugs.length; i<ln; ++i) {
            var lnm = findBugLnm(i);
            if (lnm) {
                var nextBug = findNextBugWithLnm(i);
                var nextBugHref = nextBug ? "#" + nextBug.sl : "#";
                lnm.innerHTML = 
                    "<a href=\""+nextBugHref+"\" onmouseover=\"showbug(this,"+i+");\" onmouseout=\"hidebug();\">"+
                    "<img width=\"16\" height=\"16\" src=\"/static/app/images/debug_persp.gif\" style=\"border-style: none;\"></img>"+
                    "</a>";
            }
        }
    }
    YAHOO.util.Event.onDOMReady(showBugs, null, true);

    function findBugLnm(bugIdx) {
        var bug = bugs[bugIdx];
        if (bug.sl > 0) {
            var lnm = document.getElementById('lnml-' + bug.sl);
            if (lnm) {
                return lnm;
            }
        }
        return null;
    }

    function findNextBugWithLnm(bugIdx) {
        var sl = bugs[bugIdx].sl;
        for (var i = bugIdx+1, ln=bugs.length; i<ln; i++) {
            if (bugs[i].sl > sl) {
                var lnm = findBugLnm(i);
                if (lnm) {
                    return bugs[i];
                }
            }
        }
        return null;
    }
    
    function triggerLineHotspot(line) {
        var imgTag = document.getElementById('lnhs-' + line);
        if (imgTag) {
            imgTag.src = '/static/app/images/html_tag_obj.gif';
        }
    }

    function untriggerLineHotspot(line) {
        var imgTag = document.getElementById('lnhs-' + line);
        if (imgTag) {
            imgTag.src = '/static/app/images/1x1.gif';
        }
    }
    
    function showStackOverflowQuestions() {
        document.getElementById('page-mask').style.visibility = 'visible';
        var dropdown = document.getElementById('so-question-panel');
        if (dropdown) {
            dropdown.style.display = 'block';
            var x = (getWindowWidth() - dropdown.offsetWidth) / 2;
            var y = (getWindowHeight() - dropdown.offsetHeight) / 2;
            dropdown.style.left = x + 'px';
            dropdown.style.top = y + 'px';
            dropdown.style.visibility = 'visible';
        }
    }

    function hideStackOverflowQuestions() {
        var dropdown = document.getElementById('so-question-panel');
        if (dropdown) {
            dropdown.style.visibility = 'hidden';
            dropdown.style.display = 'none';
        }
        document.getElementById('page-mask').style.visibility = 'hidden';
    }

    function showSnippetDialog(line) {
        showSnippetDialogFromTo(line, line);
    }

    function showSnippetDialogFromTo(from, to) {
        document.getElementById('page-mask').style.visibility = 'visible';
        var dropdown = document.getElementById('snippet-dropdown');
        dropdown.style.display = 'block';
        var x = (getWindowWidth() - dropdown.offsetWidth) / 2;
        var y = (getWindowHeight() - dropdown.offsetHeight) / 2;
        dropdown.style.left = x + 'px';
        dropdown.style.top = y + 'px';
        dropdown.style.visibility = 'visible';
        var form = document.getElementById('snippet-form');
        form.snippet_start.value = from;
        form.snippet_end.value = to;
        fetchSnippet();
    }

    function hideSnippetDialog() {
        var dropdown = document.getElementById('snippet-dropdown');
        dropdown.style.visibility = 'hidden';
        dropdown.style.display = 'none';
        document.getElementById('page-mask').style.visibility = 'hidden';
    }
    
    function escKeyListener() {
        hideSnippetDialog();
        hideStackOverflowQuestions();
    }

    keyListener = new YAHOO.util.KeyListener(document, {keys:[27]}, escKeyListener);
    YAHOO.util.Event.onDOMReady(keyListener.enable, keyListener, true);
        
    
    function incFromLine() {
        var form = document.getElementById('snippet-form');
        var start = form.snippet_start.value;
        var startNum = parseInt(start);
        form.snippet_start.value = startNum + 1
        var end = form.snippet_end.value;
        var endNum = parseInt(end);
        if (endNum < startNum + 1) {
            form.snippet_end.value = form.snippet_start.value;
        }
        fetchSnippet();
    }

    function decFromLine() {
        var form = document.getElementById('snippet-form');
        var start = form.snippet_start.value;
        var startNum = parseInt(start);
        form.snippet_start.value = startNum <= 1 ? 1 : (startNum - 1);
        fetchSnippet();
    }

    function incToLine() {
        var form = document.getElementById('snippet-form');
        var end = form.snippet_end.value;
        var endNum = parseInt(end);
        form.snippet_end.value = endNum + 1;
        fetchSnippet();
    }

    function decToLine() {
        var form = document.getElementById('snippet-form');
        var end = form.snippet_end.value;
        var endNum = parseInt(end);
        form.snippet_end.value = endNum <= 1 ? 1 : (endNum - 1);
        var start = form.snippet_start.value;
        var startNum = parseInt(start);
        if (endNum - 1 < startNum) {
            form.snippet_start.value = form.snippet_end.value;
        }
        fetchSnippet();
    }

    function fetchSnippet() {
        var preview = document.getElementById('snippet-preview');
        var form = document.getElementById('snippet-form');
        var start = form.snippet_start.value;
        var end = form.snippet_end.value;
        var startNum = parseInt(start);
        var endNum = parseInt(end);
        var length = endNum - startNum + 1;

        var sUrl = location.protocol+"//"+location.host+location.pathname+
                   "?fragment=line&start="+start+"&length="+length;

        var callback = {
            success: function(oResponse) {
                var snippet = oResponse.responseText;
                preview.innerHTML = snippet;
                form.snippet_html.value = snippet;
                form.snippet_html.select();
                form.snippet_html.focus();
            },

            failure: function(oResponse) {
                preview.innerHTML = "";
                form.snippet_html.value = "";
            },

            timeout: 7000
        };

        YAHOO.util.Connect.asyncRequest('GET', sUrl, callback);
    }

    fileSource = function() {
    	var leftTabView;

    	function getOutlineHTML() {
        	var outlineDiv = document.getElementById("outline-view-div");
        	var html = outlineDiv.innerHTML;
        	outlineDiv.innerHTML = "";
        	return html;
    	}

        function addTabs() {
            var allviews = document.getElementById('allviews_hidden').innerHTML;
            var activeview = document.getElementById('activeview_hidden').innerHTML;

            leftTabView = new YAHOO.widget.TabView();

            if (allviews.indexOf('o') >= 0) {
                leftTabView.addTab( new YAHOO.widget.Tab({
                    label: 'Outline',
                    content: getOutlineHTML(),
                    cacheData: true,
                    active: activeview == 'o'
                }));
            }

            leftTabView.addTab( new YAHOO.widget.Tab({
                label: 'Files',
                content: '<div class="file-nav-tree-container"><div id="treeDiv"></div></div>',
                cacheData: true,
                active: activeview == 'f'
            }));

            if (allviews.indexOf('h') >=0 ) {
                leftTabView.addTab( new YAHOO.widget.Tab({
                    label: 'Hierarchy',
                    content: document.getElementById("th-view-div").innerHTML,
                    cacheData: true,
                    active: activeview == 'h'
                }));
            }
         
            if (!isGCEnterpriseEdition() && !isBrowserMSIE7() && !isBrowserMSIE6()) {   
                var commentURL = window.location.protocol + "//grepcode.com" + window.location.pathname;
            
                leftTabView.addTab(new YAHOO.widget.Tab({
                    label: 'Comments',
                    content: '<div class="fb-comments" data-href=' + commentURL + ' data-num-posts="20" data-width="380"></div>',
                    cacheData: false,
                    active: false
                }));
            }

            if (bugs.length > 0) {
                var links = "<ul class='bug-list'>";
                for(var i = 0; i < bugs.length; ++i) {
                    var bug = bugs[i];
                    var str = bug.m;
                    if (bug.sl > 0) {
                        var lnm = document.getElementById('lnml-' + bug.sl);
                        if (lnm) {
                            str = '<div class="bug-message">'+
                                    '<div class="ln"><a href="#' + bug.sl + '">' + bug.sl + '</a></div>'+': '+str+
                                  '</div>';
                        }
                    }
                    links += "<li class='bug-item'><span>" + str + "</span></li>";
                }
                links += "</ul>";
                var bugsTab = new YAHOO.widget.Tab({
                    label: 'Bugs (' + bugs.length + ')',
                    content: links,
                    active: activeview == 'b'
                });

                bugsTab.addListener('click', function(e) {
                    for (var i=0, ln=bugs.length; i<ln; ++i) {
                        var lnm = findBugLnm(i);
                        if (lnm) {
                            var ch = lnm.childNodes[0];
                            ch.focus();
                            break;
                        }
                    }
                });

                leftTabView.addTab(bugsTab);
            }

            leftTabView.appendTo('file-nav-tabs');
        }
    
        return {
            init: function() {
                addTabs();
                setInitialProfile();
            }
        };
    }();

    YAHOO.util.Event.onDOMReady(fileSource.init, fileSource, true);
    
    YAHOO.util.Event.onDOMReady(projectTree.init, projectTree, true);
    
    function setDimensions() {
        var fNavDiv = document.getElementById('file-nav-panel');
        var fSrcDiv = document.getElementById('source-view');

        fNavDiv.style.height = (getWindowHeight() - getPageOffsetTop(fNavDiv) - 1) + 'px';

        fSrcDiv.style.left = getPageOffsetRight(fNavDiv) + 'px';
        fSrcDiv.style.bottom = '0px';
        fSrcDiv.style.right = '0px';
        fSrcDiv.style.width = (getWindowWidth() - getPageOffsetRight(fNavDiv) - 1) + 'px';
        fSrcDiv.style.height = (getWindowHeight() - getPageOffsetTop(fNavDiv) - 1) + 'px';
    }

    YAHOO.util.Event.onDOMReady(setDimensions, null, true);
    YAHOO.util.Event.on(window, 'resize', setDimensions);

    function highlightLine(line) {
        var lDiv = document.getElementById('line-' + line);
        if (lDiv) {
            lDiv.style.background = '#e0e0ff';
        }
    }

    function highlightCurrentLine() {
        var anchor = window.location.hash;
        if (anchor) {
            anchor = anchor.substring(1);
            var line = parseInt(anchor);
            if (!isNaN(line)) {
                highlightLine(line);
            }
        }
    }
    </script>
</div>



    
        <div id="fb-root"></div>
        <img id="comment-ping-back" src="/static/app/images/1x1.gif"/>
        <script>
            window.fbAsyncInit = function() {
                FB.init({
                    appId:  '143989634057',
                    status: true,
                    cookie: true,
                    xfbml:  true
                });

                FB.Event.subscribe('comment.create', function(response) {
                    document.getElementById('comment-ping-back').src = "/event?type=comment.create&url=" + window.location + "&href=" + response.href + "&commentID=" + response.commentID;
                });
            };

            (function(d, s, id) {
                var js, fjs = d.getElementsByTagName(s)[0];
                if (d.getElementById(id)) {return;}
                js = d.createElement(s); js.id = id;
                js.src = "//connect.facebook.net/en_US/all.js#xfbml=1";
                fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));
        </script>
    
    
</div>


    </div>
    <script>
        YAHOO.util.Event.onDOMReady(function() {
            var html = document.getElementById('html');
            html.style.overflow = "hidden";
        }, null, true);
    </script>


        
        
            <div id="notification-bar">
                <table width="100%" border="0">
                    <tr valign="middle">
                        <td valign="middle"><span class="message">New to GrepCode? Check out our <a href="/faq" onclick="disableNotification(); return true;">FAQ</a></span></td>
                        <td valign="middle"><span class="cancel"><a href="#" onclick="disableNotification(); return false;">X</a></span></td>
                    </tr>
                </table>
            </div>
            <script type="text/javascript">
                YAHOO.util.Event.onDOMReady(doNotification);
            </script>
        
        
        

        

        

        
        
            <script type="text/javascript">
            try {
                pageTracker._trackPageview();
            } catch(err) {
            }
            </script>
        

        
        
            <!-- Google +1 -->
            <script type="text/javascript">
              (function() {
                var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
                po.src = 'https://apis.google.com/js/plusone.js';
                var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
              })();
            </script>
        

        
    </body>
</html>
