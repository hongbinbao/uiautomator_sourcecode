<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html id="html">
    <head>
        <title>GC: AppHelperBase - com.android.uiautomator.common.helpers.AppHelperBase (.java) - GrepCode Class Source</title>
        <meta name="verify-v1" content="oDbHfknRLVnvs+1b/O61iSxPEhVr3O08Fd3QqJ1cGh8="/>
        <meta name="verify-v1" content="d2G+nnw2Xr6jBfde7yNvdZirW9Y6K0fa+56zhEmm6YA="/>
        <meta name="msvalidate.01" content="62B5A32F828BC27E3852FB825A5156E4" />
        <meta name="description" content="com.android.uiautomator.common.helpers.AppHelperBase - Base app helper class intended for all app helper to extend"/>
        <meta property="fb:app_id" content="143989634057"/>
        <link rel="canonical" href="http://grepcode.com/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java?av=f"/>
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
    <div id="entityid_hidden" style="display:none">repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers$AppHelperBase.java</div>
    <div id="entitytype_hidden" style="display:none">file</div>

    
    
<div class="file-staging-page">
    <div class="entity-header">
        <div class="entity-nav">
            <ul>
                <li><a href="http://repository.grepcode.com/java/ext/" rel="nofollow" class="external-link">GrepCode</a></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><a href="../../../../../../../../../../../../project/repository.grepcode.com/java/ext/com.google.android/android/"><span title="com.google.android / android">com.google.android / android</span></a></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><span>
    <span>
        <a class="nav" href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.3_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span><img class='img_base img_jdt_elcl16_backward_nav' src='/static/app/images/1x1.gif' border='0' title='4.4.3_r1' width='16' height='16'></img></span></a>
    </span>
    <a title="Version" href="../../../../../../../../../../../../snapshot/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/"><span id="current-snapshot">4.4.4_r1</span></a>
    
        <a href="#" class="snapshots-more"
           onclick="this.blur();showSiblings(this);return false;"><img class='img_base img_jdt_elcl16_next_nav' src='/static/app/images/1x1.gif' border='0' title='4.3_r1&nbsp;-&nbsp;5.0.0_r1' width='16' height='16'></img></a>
    
    <div class="snapshots-panel" style="visibility: hidden; z-index:2">
        <div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.0.0_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span>5.0.0_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.L_preview/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span>5.L_preview</span></a>
        </div><div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span class="this-snapshot">4.4.4_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.3_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span>4.4.3_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.2_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span>4.4.2_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.1_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span>4.4.1_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span>4.4_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3.1_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span>4.3.1_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3_r2.1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span>4.3_r2.1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span>4.3_r1</span></a>
        </div>
    </div>
    <span>
        <a class="nav" href="../../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.L_preview/com/android/uiautomator/common/helpers/AppHelperBase.java/"><span><img class='img_base img_jdt_elcl16_forward_nav' src='/static/app/images/1x1.gif' border='0' title='5.L_preview' width='16' height='16'></img></span></a>
    </span>
</span></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><span class="entity-name" title="com.android.uiautomator.common.helpers.AppHelperBase">com.android.uiautomator.common.helpers.AppHelperBase</span></li>
            </ul>
            <div class="entity-header-links">
                
            <!-- Google +1 -->
            <div class="g-plusone" data-size="small" data-annotation="none"></div>
        
                <span><img class='img_base img_jdt_elcl16_search' src='/static/app/images/1x1.gif' border='0' title='Find usages' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../../search/usages?id=repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase&amp;type=type&amp;k=u" rel="nofollow" title="Find usages of com.android.uiautomator.common.helpers.AppHelperBase">Find Usages</a>
                <span><img class='img_base img_jdt_eview16_compare_view' src='/static/app/images/1x1.gif' border='0' title='Diff' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/?v=diff&amp;id2=4.4.3_r1" rel="nofollow" title="Compare with version 4.4.3_r1">Diff</a>
                <span><img class='img_base img_jdt_obj16_source_editor' src='/static/app/images/1x1.gif' border='0' title='View as plain text' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/?v=source" rel="nofollow" title="View as plain text">Raw</a>
                <span><img class='img_base img_jdt_elcl16_save' src='/static/app/images/1x1.gif' border='0' title='Download file' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java/?v=source&amp;disposition=attachment" rel="nofollow" title="Download file">Download</a>
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
<div class="line" id="line-1"><div class="lnml" id="lnml-1"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(1);" onmouseout="untriggerLineHotspot(1);"><pre><a name="1" href="#1">1</a></pre></div><div class="lnmr" id="lnmr-1" onmouseover="triggerLineHotspot(1);" onmouseout="untriggerLineHotspot(1);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(1); return false;"><img id="lnhs-1" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">/*</span></pre></div><div class="line" id="line-2"><div class="lnml" id="lnml-2"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(2);" onmouseout="untriggerLineHotspot(2);"><pre><a name="2" href="#2">2</a></pre></div><div class="lnmr" id="lnmr-2" onmouseover="triggerLineHotspot(2);" onmouseout="untriggerLineHotspot(2);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(2); return false;"><img id="lnhs-2" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;Copyright&nbsp;(C)&nbsp;2013&nbsp;The&nbsp;Android&nbsp;Open&nbsp;Source&nbsp;Project</span></pre></div><div class="line" id="line-3"><div class="lnml" id="lnml-3"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(3);" onmouseout="untriggerLineHotspot(3);"><pre><a name="3" href="#3">3</a></pre></div><div class="lnmr" id="lnmr-3" onmouseover="triggerLineHotspot(3);" onmouseout="untriggerLineHotspot(3);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(3); return false;"><img id="lnhs-3" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*</span></pre></div><div class="line" id="line-4"><div class="lnml" id="lnml-4"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(4);" onmouseout="untriggerLineHotspot(4);"><pre><a name="4" href="#4">4</a></pre></div><div class="lnmr" id="lnmr-4" onmouseover="triggerLineHotspot(4);" onmouseout="untriggerLineHotspot(4);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(4); return false;"><img id="lnhs-4" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;Licensed&nbsp;under&nbsp;the&nbsp;Apache&nbsp;License,&nbsp;Version&nbsp;2.0&nbsp;(the&nbsp;"License");</span></pre></div><div class="line" id="line-5"><div class="lnml" id="lnml-5"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(5);" onmouseout="untriggerLineHotspot(5);"><pre><a name="5" href="#5">5</a></pre></div><div class="lnmr" id="lnmr-5" onmouseover="triggerLineHotspot(5);" onmouseout="untriggerLineHotspot(5);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(5); return false;"><img id="lnhs-5" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;you&nbsp;may&nbsp;not&nbsp;use&nbsp;this&nbsp;file&nbsp;except&nbsp;in&nbsp;compliance&nbsp;with&nbsp;the&nbsp;License.</span></pre></div><div class="line" id="line-6"><div class="lnml" id="lnml-6"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(6);" onmouseout="untriggerLineHotspot(6);"><pre><a name="6" href="#6">6</a></pre></div><div class="lnmr" id="lnmr-6" onmouseover="triggerLineHotspot(6);" onmouseout="untriggerLineHotspot(6);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(6); return false;"><img id="lnhs-6" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;You&nbsp;may&nbsp;obtain&nbsp;a&nbsp;copy&nbsp;of&nbsp;the&nbsp;License&nbsp;at</span></pre></div><div class="line" id="line-7"><div class="lnml" id="lnml-7"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(7);" onmouseout="untriggerLineHotspot(7);"><pre><a name="7" href="#7">7</a></pre></div><div class="lnmr" id="lnmr-7" onmouseover="triggerLineHotspot(7);" onmouseout="untriggerLineHotspot(7);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(7); return false;"><img id="lnhs-7" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*</span></pre></div><div class="line" id="line-8"><div class="lnml" id="lnml-8"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(8);" onmouseout="untriggerLineHotspot(8);"><pre><a name="8" href="#8">8</a></pre></div><div class="lnmr" id="lnmr-8" onmouseover="triggerLineHotspot(8);" onmouseout="untriggerLineHotspot(8);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(8); return false;"><img id="lnhs-8" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;http://www.apache.org/licenses/LICENSE-2.0</span></pre></div><div class="line" id="line-9"><div class="lnml" id="lnml-9"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(9);" onmouseout="untriggerLineHotspot(9);"><pre><a name="9" href="#9">9</a></pre></div><div class="lnmr" id="lnmr-9" onmouseover="triggerLineHotspot(9);" onmouseout="untriggerLineHotspot(9);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(9); return false;"><img id="lnhs-9" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*</span></pre></div><div class="line" id="line-10"><div class="lnml" id="lnml-10"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(10);" onmouseout="untriggerLineHotspot(10);"><pre><a name="10" href="#10">10</a></pre></div><div class="lnmr" id="lnmr-10" onmouseover="triggerLineHotspot(10);" onmouseout="untriggerLineHotspot(10);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(10); return false;"><img id="lnhs-10" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;*&nbsp;Unless&nbsp;required&nbsp;by&nbsp;applicable&nbsp;law&nbsp;or&nbsp;agreed&nbsp;to&nbsp;in&nbsp;writing,&nbsp;software</span></pre></div><div class="line" id="line-11"><div class="lnml" id="lnml-11"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(11);" onmouseout="untriggerLineHotspot(11);"><pre><a name="11" href="#11">11</a></pre></div><div class="lnmr" id="lnmr-11" onmouseover="triggerLineHotspot(11);" onmouseout="untriggerLineHotspot(11);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(11); return false;"><img id="lnhs-11" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;*&nbsp;distributed&nbsp;under&nbsp;the&nbsp;License&nbsp;is&nbsp;distributed&nbsp;on&nbsp;an&nbsp;"AS&nbsp;IS"&nbsp;BASIS,</span></pre></div><div class="line" id="line-12"><div class="lnml" id="lnml-12"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(12);" onmouseout="untriggerLineHotspot(12);"><pre><a name="12" href="#12">12</a></pre></div><div class="lnmr" id="lnmr-12" onmouseover="triggerLineHotspot(12);" onmouseout="untriggerLineHotspot(12);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(12); return false;"><img id="lnhs-12" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;*&nbsp;WITHOUT&nbsp;WARRANTIES&nbsp;OR&nbsp;CONDITIONS&nbsp;OF&nbsp;ANY&nbsp;KIND,&nbsp;either&nbsp;express&nbsp;or&nbsp;implied.</span></pre></div><div class="line" id="line-13"><div class="lnml" id="lnml-13"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(13);" onmouseout="untriggerLineHotspot(13);"><pre><a name="13" href="#13">13</a></pre></div><div class="lnmr" id="lnmr-13" onmouseover="triggerLineHotspot(13);" onmouseout="untriggerLineHotspot(13);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(13); return false;"><img id="lnhs-13" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;*&nbsp;See&nbsp;the&nbsp;License&nbsp;for&nbsp;the&nbsp;specific&nbsp;language&nbsp;governing&nbsp;permissions&nbsp;and</span></pre></div><div class="line" id="line-14"><div class="lnml" id="lnml-14"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(14);" onmouseout="untriggerLineHotspot(14);"><pre><a name="14" href="#14">14</a></pre></div><div class="lnmr" id="lnmr-14" onmouseover="triggerLineHotspot(14);" onmouseout="untriggerLineHotspot(14);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(14); return false;"><img id="lnhs-14" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;*&nbsp;limitations&nbsp;under&nbsp;the&nbsp;License.</span></pre></div><div class="line" id="line-15"><div class="lnml" id="lnml-15"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(15);" onmouseout="untriggerLineHotspot(15);"><pre><a name="15" href="#15">15</a></pre></div><div class="lnmr" id="lnmr-15" onmouseover="triggerLineHotspot(15);" onmouseout="untriggerLineHotspot(15);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(15); return false;"><img id="lnhs-15" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;*/</span></pre></div><div class="line" id="line-16"><div class="lnml" id="lnml-16"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(16);" onmouseout="untriggerLineHotspot(16);"><pre><a name="16" href="#16">16</a></pre></div><div class="lnmr" id="lnmr-16" onmouseover="triggerLineHotspot(16);" onmouseout="untriggerLineHotspot(16);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(16); return false;"><img id="lnhs-16" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="kw">package</span>&nbsp;com.android.uiautomator.common.helpers;</pre></div><div class="line" id="line-17"><div class="lnml" id="lnml-17"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(17);" onmouseout="untriggerLineHotspot(17);"><pre><a name="17" href="#17">17</a></pre></div><div class="lnmr" id="lnmr-17" onmouseover="triggerLineHotspot(17);" onmouseout="untriggerLineHotspot(17);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(17); return false;"><img id="lnhs-17" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-18"><div class="lnml" id="lnml-18"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(18);" onmouseout="untriggerLineHotspot(18);"><pre><a name="18" href="#18">18</a></pre></div><div class="lnmr" id="lnmr-18" onmouseover="triggerLineHotspot(18);" onmouseout="untriggerLineHotspot(18);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(18); return false;"><img id="lnhs-18" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/BufferedReader.java#BufferedReader" title="java.io.BufferedReader">java.io.BufferedReader</a>;</pre></div><div class="line" id="line-19"><div class="lnml" id="lnml-19"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(19);" onmouseout="untriggerLineHotspot(19);"><pre><a name="19" href="#19">19</a></pre></div><div class="lnmr" id="lnmr-19" onmouseover="triggerLineHotspot(19);" onmouseout="untriggerLineHotspot(19);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(19); return false;"><img id="lnhs-19" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/IOException.java#IOException" title="java.io.IOException">java.io.IOException</a>;<br/><a name="19"></a><br/><a name="20"></a></pre></div><div class="javadoc-area"><div class="javadoc"><a name="21"></a><a name="22"></a><a name="23"></a><a name="24"></a> Base app helper class intended for all app helper to extend.
 This class provides common APIs that are expected to be present across
 all app helpers.
</div></div><div class="line" id="line-25"><div class="lnml" id="lnml-25"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(25);" onmouseout="untriggerLineHotspot(25);"><pre><a name="25" href="#25">25</a></pre></div><div class="lnmr" id="lnmr-25" onmouseover="triggerLineHotspot(25);" onmouseout="untriggerLineHotspot(25);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(25); return false;"><img id="lnhs-25" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-26"><div class="lnml" id="lnml-26"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(26);" onmouseout="untriggerLineHotspot(26);"><pre><a name="26" href="#26">26</a></pre></div><div class="lnmr" id="lnmr-26" onmouseover="triggerLineHotspot(26);" onmouseout="untriggerLineHotspot(26);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(26); return false;"><img id="lnhs-26" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="kw">public</span>&nbsp;<span class="kw">abstract</span>&nbsp;<span class="kw">class</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'type','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="AppHelperBase">AppHelperBase</a>&nbsp;{</pre></div><div class="line" id="line-27"><div class="lnml" id="lnml-27"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(27);" onmouseout="untriggerLineHotspot(27);"><pre><a name="27" href="#27">27</a></pre></div><div class="lnmr" id="lnmr-27" onmouseover="triggerLineHotspot(27);" onmouseout="untriggerLineHotspot(27);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(27); return false;"><img id="lnhs-27" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-28"><div class="lnml" id="lnml-28"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(28);" onmouseout="untriggerLineHotspot(28);"><pre><a name="28" href="#28">28</a></pre></div><div class="lnmr" id="lnmr-28" onmouseover="triggerLineHotspot(28);" onmouseout="untriggerLineHotspot(28);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(28); return false;"><img id="lnhs-28" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">/*</span></pre></div><div class="line" id="line-29"><div class="lnml" id="lnml-29"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(29);" onmouseout="untriggerLineHotspot(29);"><pre><a name="29" href="#29">29</a></pre></div><div class="lnmr" id="lnmr-29" onmouseover="triggerLineHotspot(29);" onmouseout="untriggerLineHotspot(29);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(29); return false;"><img id="lnhs-29" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;App&nbsp;helpers&nbsp;should&nbsp;provide&nbsp;methods&nbsp;for&nbsp;accessing&nbsp;various&nbsp;UI&nbsp;widgets.</span></pre></div><div class="line" id="line-30"><div class="lnml" id="lnml-30"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(30);" onmouseout="untriggerLineHotspot(30);"><pre><a name="30" href="#30">30</a></pre></div><div class="lnmr" id="lnmr-30" onmouseover="triggerLineHotspot(30);" onmouseout="untriggerLineHotspot(30);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(30); return false;"><img id="lnhs-30" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Assume&nbsp;the&nbsp;app&nbsp;has&nbsp;an&nbsp;Action&nbsp;Bar,&nbsp;the&nbsp;helper&nbsp;should&nbsp;provide&nbsp;something&nbsp;similar&nbsp;to</span></pre></div><div class="line" id="line-31"><div class="lnml" id="lnml-31"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(31);" onmouseout="untriggerLineHotspot(31);"><pre><a name="31" href="#31">31</a></pre></div><div class="lnmr" id="lnmr-31" onmouseover="triggerLineHotspot(31);" onmouseout="untriggerLineHotspot(31);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(31); return false;"><img id="lnhs-31" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;SomeAppHelper.ActionBar.getRefreshButton().&nbsp;Methods&nbsp;like&nbsp;this&nbsp;help&nbsp;the&nbsp;tests&nbsp;check&nbsp;the</span></pre></div><div class="line" id="line-32"><div class="lnml" id="lnml-32"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(32);" onmouseout="untriggerLineHotspot(32);"><pre><a name="32" href="#32">32</a></pre></div><div class="lnmr" id="lnmr-32" onmouseover="triggerLineHotspot(32);" onmouseout="untriggerLineHotspot(32);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(32); return false;"><img id="lnhs-32" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;state&nbsp;of&nbsp;the&nbsp;targeted&nbsp;widget&nbsp;as&nbsp;well&nbsp;as&nbsp;clicking&nbsp;it&nbsp;if&nbsp;need&nbsp;be.&nbsp;These&nbsp;types&nbsp;of&nbsp;methods&nbsp;are</span></pre></div><div class="line" id="line-33"><div class="lnml" id="lnml-33"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(33);" onmouseout="untriggerLineHotspot(33);"><pre><a name="33" href="#33">33</a></pre></div><div class="lnmr" id="lnmr-33" onmouseover="triggerLineHotspot(33);" onmouseout="untriggerLineHotspot(33);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(33); return false;"><img id="lnhs-33" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;referred&nbsp;to&nbsp;as&nbsp;object&nbsp;getters.&nbsp;If&nbsp;there&nbsp;are&nbsp;different&nbsp;components,&nbsp;consider&nbsp;creating&nbsp;internal</span></pre></div><div class="line" id="line-34"><div class="lnml" id="lnml-34"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(34);" onmouseout="untriggerLineHotspot(34);"><pre><a name="34" href="#34">34</a></pre></div><div class="lnmr" id="lnmr-34" onmouseover="triggerLineHotspot(34);" onmouseout="untriggerLineHotspot(34);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(34); return false;"><img id="lnhs-34" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;name&nbsp;spaces&nbsp;as&nbsp;in&nbsp;the&nbsp;.ActionBar&nbsp;example&nbsp;for&nbsp;better&nbsp;context.</span></pre></div><div class="line" id="line-35"><div class="lnml" id="lnml-35"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(35);" onmouseout="untriggerLineHotspot(35);"><pre><a name="35" href="#35">35</a></pre></div><div class="lnmr" id="lnmr-35" onmouseover="triggerLineHotspot(35);" onmouseout="untriggerLineHotspot(35);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(35); return false;"><img id="lnhs-35" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</span></pre></div><div class="line" id="line-36"><div class="lnml" id="lnml-36"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(36);" onmouseout="untriggerLineHotspot(36);"><pre><a name="36" href="#36">36</a></pre></div><div class="lnmr" id="lnmr-36" onmouseover="triggerLineHotspot(36);" onmouseout="untriggerLineHotspot(36);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(36); return false;"><img id="lnhs-36" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Adding&nbsp;basic&nbsp;units&nbsp;of&nbsp;functionality&nbsp;APIs&nbsp;is&nbsp;also&nbsp;very&nbsp;helpful&nbsp;to&nbsp;test.</span></pre></div><div class="line" id="line-37"><div class="lnml" id="lnml-37"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(37);" onmouseout="untriggerLineHotspot(37);"><pre><a name="37" href="#37">37</a></pre></div><div class="lnmr" id="lnmr-37" onmouseover="triggerLineHotspot(37);" onmouseout="untriggerLineHotspot(37);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(37); return false;"><img id="lnhs-37" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Consider&nbsp;the&nbsp;Alarm&nbsp;clock&nbsp;application&nbsp;as&nbsp;an&nbsp;example.&nbsp;It&nbsp;would&nbsp;be&nbsp;helpful&nbsp;if&nbsp;its&nbsp;helper</span></pre></div><div class="line" id="line-38"><div class="lnml" id="lnml-38"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(38);" onmouseout="untriggerLineHotspot(38);"><pre><a name="38" href="#38">38</a></pre></div><div class="lnmr" id="lnmr-38" onmouseover="triggerLineHotspot(38);" onmouseout="untriggerLineHotspot(38);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(38); return false;"><img id="lnhs-38" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;provided&nbsp;basic&nbsp;functionality&nbsp;such&nbsp;as,&nbsp;setAlarm(Date)&nbsp;and&nbsp;deleteAlarm(Date).&nbsp;Such&nbsp;basic</span></pre></div><div class="line" id="line-39"><div class="lnml" id="lnml-39"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(39);" onmouseout="untriggerLineHotspot(39);"><pre><a name="39" href="#39">39</a></pre></div><div class="lnmr" id="lnmr-39" onmouseover="triggerLineHotspot(39);" onmouseout="untriggerLineHotspot(39);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(39); return false;"><img id="lnhs-39" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;and&nbsp;key&nbsp;functionality&nbsp;helper&nbsp;methods,&nbsp;will&nbsp;abstract&nbsp;the&nbsp;tests&nbsp;from&nbsp;the&nbsp;UI&nbsp;implementation&nbsp;and</span></pre></div><div class="line" id="line-40"><div class="lnml" id="lnml-40"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(40);" onmouseout="untriggerLineHotspot(40);"><pre><a name="40" href="#40">40</a></pre></div><div class="lnmr" id="lnmr-40" onmouseover="triggerLineHotspot(40);" onmouseout="untriggerLineHotspot(40);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(40); return false;"><img id="lnhs-40" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;make&nbsp;tests&nbsp;more&nbsp;reliable.</span></pre></div><div class="line" id="line-41"><div class="lnml" id="lnml-41"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(41);" onmouseout="untriggerLineHotspot(41);"><pre><a name="41" href="#41">41</a></pre></div><div class="lnmr" id="lnmr-41" onmouseover="triggerLineHotspot(41);" onmouseout="untriggerLineHotspot(41);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(41); return false;"><img id="lnhs-41" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre><span class="comment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</span><br/><a name="41"></a><br/><a name="42"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="43"></a><a name="44"></a><a name="45"></a><a name="46"></a><a name="47"></a><a name="48"></a><a name="49"></a> Launches the application.

 This is typically performed by executing a shell command to launch the application
 via Intent. It is possible to launch the application by automating the Launcher
 views and finding the target app icon to launch, however, this is prone to failure if
 the Launcher UI implementation differ from one platform to another.
 </div></div><div class="line" id="line-50"><div class="lnml" id="lnml-50"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(50);" onmouseout="untriggerLineHotspot(50);"><pre><a name="50" href="#50">50</a></pre></div><div class="lnmr" id="lnmr-50" onmouseover="triggerLineHotspot(50);" onmouseout="untriggerLineHotspot(50);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(50); return false;"><img id="lnhs-50" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-51"><div class="lnml" id="lnml-51"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(51);" onmouseout="untriggerLineHotspot(51);"><pre><a name="51" href="#51">51</a></pre></div><div class="lnmr" id="lnmr-51" onmouseover="triggerLineHotspot(51);" onmouseout="untriggerLineHotspot(51);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(51); return false;"><img id="lnhs-51" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">abstract</span>&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@open()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="AppHelperBase.open%28%29">open</a>();<br/><a name="51"></a><br/><a name="52"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="53"></a><a name="54"></a><a name="55"></a><a name="56"></a><a name="57"></a><a name="58"></a> Checks if the application is in foreground.

 This is typically performed by verifying the current package name of the foreground
 application. See UiDevice.getCurrentPackageName()
 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Returns:</span></dt><dd>true if open, else false.</dd></dl></div></div></div><div class="line" id="line-59"><div class="lnml" id="lnml-59"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(59);" onmouseout="untriggerLineHotspot(59);"><pre><a name="59" href="#59">59</a></pre></div><div class="lnmr" id="lnmr-59" onmouseover="triggerLineHotspot(59);" onmouseout="untriggerLineHotspot(59);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(59); return false;"><img id="lnhs-59" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-60"><div class="lnml" id="lnml-60"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(60);" onmouseout="untriggerLineHotspot(60);"><pre><a name="60" href="#60">60</a></pre></div><div class="lnmr" id="lnmr-60" onmouseover="triggerLineHotspot(60);" onmouseout="untriggerLineHotspot(60);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(60); return false;"><img id="lnhs-60" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">abstract</span>&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">boolean</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@isOpen()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="AppHelperBase.isOpen%28%29">isOpen</a>();<br/><a name="60"></a><br/><a name="61"></a><br/><a name="62"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="63"></a><a name="64"></a><a name="65"></a> Helper to execute a shell command.
 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>command</code></dd></dl></div></div></div><div class="line" id="line-66"><div class="lnml" id="lnml-66"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(66);" onmouseout="untriggerLineHotspot(66);"><pre><a name="66" href="#66">66</a></pre></div><div class="lnmr" id="lnmr-66" onmouseover="triggerLineHotspot(66);" onmouseout="untriggerLineHotspot(66);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(66); return false;"><img id="lnhs-66" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-67"><div class="lnml" id="lnml-67"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(67);" onmouseout="untriggerLineHotspot(67);"><pre><a name="67" href="#67">67</a></pre></div><div class="lnmr" id="lnmr-67" onmouseover="triggerLineHotspot(67);" onmouseout="untriggerLineHotspot(67);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(67); return false;"><img id="lnhs-67" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">protected</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@runShellCommand(java.lang.String)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="AppHelperBase.runShellCommand%28java.lang.String%29">runShellCommand</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>&nbsp;<span class="mark-0#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">command</span>)&nbsp;{</pre></div><div class="line" id="line-68"><div class="lnml" id="lnml-68"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(68);" onmouseout="untriggerLineHotspot(68);"><pre><a name="68" href="#68">68</a></pre></div><div class="lnmr" id="lnmr-68" onmouseover="triggerLineHotspot(68);" onmouseout="untriggerLineHotspot(68);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(68); return false;"><img id="lnhs-68" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Process.java#Process" title="java.lang.Process">Process</a>&nbsp;<span class="mark-1#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">p</span>&nbsp;=&nbsp;<span class="kw">null</span>;</pre></div><div class="line" id="line-69"><div class="lnml" id="lnml-69"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(69);" onmouseout="untriggerLineHotspot(69);"><pre><a name="69" href="#69">69</a></pre></div><div class="lnmr" id="lnmr-69" onmouseover="triggerLineHotspot(69);" onmouseout="untriggerLineHotspot(69);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(69); return false;"><img id="lnhs-69" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/BufferedReader.java#BufferedReader" title="java.io.BufferedReader">BufferedReader</a>&nbsp;<span class="mark-2#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">resultReader</span>&nbsp;=&nbsp;<span class="kw">null</span>;</pre></div><div class="line" id="line-70"><div class="lnml" id="lnml-70"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(70);" onmouseout="untriggerLineHotspot(70);"><pre><a name="70" href="#70">70</a></pre></div><div class="lnmr" id="lnmr-70" onmouseover="triggerLineHotspot(70);" onmouseout="untriggerLineHotspot(70);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(70); return false;"><img id="lnhs-70" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">try</span>&nbsp;{</pre></div><div class="line" id="line-71"><div class="lnml" id="lnml-71"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(71);" onmouseout="untriggerLineHotspot(71);"><pre><a name="71" href="#71">71</a></pre></div><div class="lnmr" id="lnmr-71" onmouseover="triggerLineHotspot(71);" onmouseout="untriggerLineHotspot(71);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(71); return false;"><img id="lnhs-71" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-1#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">p</span>&nbsp;=&nbsp;Runtime.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Runtime.java#Runtime.getRuntime%28%29" title="java.lang.Runtime.getRuntime() : Runtime">getRuntime</a>().<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Runtime.java#Runtime.exec%28java.lang.String%29" title="java.lang.Runtime.exec(java.lang.String) : Process">exec</a>(<span class="mark-0#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">command</span>);</pre></div><div class="line" id="line-72"><div class="lnml" id="lnml-72"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(72);" onmouseout="untriggerLineHotspot(72);"><pre><a name="72" href="#72">72</a></pre></div><div class="lnmr" id="lnmr-72" onmouseover="triggerLineHotspot(72);" onmouseout="untriggerLineHotspot(72);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(72); return false;"><img id="lnhs-72" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">int</span>&nbsp;<span class="mark-3#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">status</span>&nbsp;=&nbsp;<span class="mark-1#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">p</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Process.java#Process.waitFor%28%29" title="java.lang.Process.waitFor() : int">waitFor</a>();</pre></div><div class="line" id="line-73"><div class="lnml" id="lnml-73"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(73);" onmouseout="untriggerLineHotspot(73);"><pre><a name="73" href="#73">73</a></pre></div><div class="lnmr" id="lnmr-73" onmouseover="triggerLineHotspot(73);" onmouseout="untriggerLineHotspot(73);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(73); return false;"><img id="lnhs-73" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">status</span>&nbsp;!=&nbsp;0)&nbsp;{</pre></div><div class="line" id="line-74"><div class="lnml" id="lnml-74"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(74);" onmouseout="untriggerLineHotspot(74);"><pre><a name="74" href="#74">74</a></pre></div><div class="lnmr" id="lnmr-74" onmouseover="triggerLineHotspot(74);" onmouseout="untriggerLineHotspot(74);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(74); return false;"><img id="lnhs-74" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">System</a>.<span class="mark-4#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">err</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/PrintStream.java#PrintStream.println%28java.lang.String%29" title="java.io.PrintStream.println(java.lang.String) : void">println</a>(String.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String.format%28java.lang.String%2Cjava.lang.Object%5B%5D%29" title="java.lang.String.format(java.lang.String,java.lang.Object[]) : String">format</a>(<span class="strliteral">"Run&nbsp;shell&nbsp;command:&nbsp;%s,&nbsp;status:&nbsp;%s"</span>,&nbsp;<span class="mark-0#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">command</span>,</pre></div><div class="line" id="line-75"><div class="lnml" id="lnml-75"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(75);" onmouseout="untriggerLineHotspot(75);"><pre><a name="75" href="#75">75</a></pre></div><div class="lnmr" id="lnmr-75" onmouseover="triggerLineHotspot(75);" onmouseout="untriggerLineHotspot(75);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(75); return false;"><img id="lnhs-75" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">status</span>));</pre></div><div class="line" id="line-76"><div class="lnml" id="lnml-76"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(76);" onmouseout="untriggerLineHotspot(76);"><pre><a name="76" href="#76">76</a></pre></div><div class="lnmr" id="lnmr-76" onmouseover="triggerLineHotspot(76);" onmouseout="untriggerLineHotspot(76);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(76); return false;"><img id="lnhs-76" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-77"><div class="lnml" id="lnml-77"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(77);" onmouseout="untriggerLineHotspot(77);"><pre><a name="77" href="#77">77</a></pre></div><div class="lnmr" id="lnmr-77" onmouseover="triggerLineHotspot(77);" onmouseout="untriggerLineHotspot(77);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(77); return false;"><img id="lnhs-77" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">catch</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/IOException.java#IOException" title="java.io.IOException">IOException</a>&nbsp;<span class="mark-5#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">e</span>)&nbsp;{</pre></div><div class="line" id="line-78"><div class="lnml" id="lnml-78"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(78);" onmouseout="untriggerLineHotspot(78);"><pre><a name="78" href="#78">78</a></pre></div><div class="lnmr" id="lnmr-78" onmouseover="triggerLineHotspot(78);" onmouseout="untriggerLineHotspot(78);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(78); return false;"><img id="lnhs-78" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">System</a>.<span class="mark-4#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">err</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/PrintStream.java#PrintStream.println%28java.lang.String%29" title="java.io.PrintStream.println(java.lang.String) : void">println</a>(<span class="strliteral">"//&nbsp;Exception&nbsp;from&nbsp;command&nbsp;"</span>&nbsp;+&nbsp;<span class="mark-0#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">command</span>&nbsp;+&nbsp;<span class="strliteral">":"</span>);</pre></div><div class="line" id="line-79"><div class="lnml" id="lnml-79"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(79);" onmouseout="untriggerLineHotspot(79);"><pre><a name="79" href="#79">79</a></pre></div><div class="lnmr" id="lnmr-79" onmouseover="triggerLineHotspot(79);" onmouseout="untriggerLineHotspot(79);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(79); return false;"><img id="lnhs-79" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">System</a>.<span class="mark-4#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">err</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/PrintStream.java#PrintStream.println%28java.lang.String%29" title="java.io.PrintStream.println(java.lang.String) : void">println</a>(<span class="mark-5#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">e</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Throwable.java#Throwable.toString%28%29" title="java.lang.Throwable.toString() : String">toString</a>());</pre></div><div class="line" id="line-80"><div class="lnml" id="lnml-80"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(80);" onmouseout="untriggerLineHotspot(80);"><pre><a name="80" href="#80">80</a></pre></div><div class="lnmr" id="lnmr-80" onmouseover="triggerLineHotspot(80);" onmouseout="untriggerLineHotspot(80);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(80); return false;"><img id="lnhs-80" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">catch</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/InterruptedException.java#InterruptedException" title="java.lang.InterruptedException">InterruptedException</a>&nbsp;<span class="mark-6#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">e</span>)&nbsp;{</pre></div><div class="line" id="line-81"><div class="lnml" id="lnml-81"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(81);" onmouseout="untriggerLineHotspot(81);"><pre><a name="81" href="#81">81</a></pre></div><div class="lnmr" id="lnmr-81" onmouseover="triggerLineHotspot(81);" onmouseout="untriggerLineHotspot(81);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(81); return false;"><img id="lnhs-81" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">System</a>.<span class="mark-4#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">err</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/PrintStream.java#PrintStream.println%28java.lang.String%29" title="java.io.PrintStream.println(java.lang.String) : void">println</a>(<span class="strliteral">"//&nbsp;Interrupted&nbsp;while&nbsp;waiting&nbsp;for&nbsp;the&nbsp;command&nbsp;to&nbsp;finish.&nbsp;"</span>);</pre></div><div class="line" id="line-82"><div class="lnml" id="lnml-82"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(82);" onmouseout="untriggerLineHotspot(82);"><pre><a name="82" href="#82">82</a></pre></div><div class="lnmr" id="lnmr-82" onmouseover="triggerLineHotspot(82);" onmouseout="untriggerLineHotspot(82);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(82); return false;"><img id="lnhs-82" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">System</a>.<span class="mark-4#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">err</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/PrintStream.java#PrintStream.println%28java.lang.String%29" title="java.io.PrintStream.println(java.lang.String) : void">println</a>(<span class="mark-6#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">e</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Throwable.java#Throwable.toString%28%29" title="java.lang.Throwable.toString() : String">toString</a>());</pre></div><div class="line" id="line-83"><div class="lnml" id="lnml-83"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(83);" onmouseout="untriggerLineHotspot(83);"><pre><a name="83" href="#83">83</a></pre></div><div class="lnmr" id="lnmr-83" onmouseover="triggerLineHotspot(83);" onmouseout="untriggerLineHotspot(83);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(83); return false;"><img id="lnhs-83" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">finally</span>&nbsp;{</pre></div><div class="line" id="line-84"><div class="lnml" id="lnml-84"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(84);" onmouseout="untriggerLineHotspot(84);"><pre><a name="84" href="#84">84</a></pre></div><div class="lnmr" id="lnmr-84" onmouseover="triggerLineHotspot(84);" onmouseout="untriggerLineHotspot(84);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(84); return false;"><img id="lnhs-84" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">try</span>&nbsp;{</pre></div><div class="line" id="line-85"><div class="lnml" id="lnml-85"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(85);" onmouseout="untriggerLineHotspot(85);"><pre><a name="85" href="#85">85</a></pre></div><div class="lnmr" id="lnmr-85" onmouseover="triggerLineHotspot(85);" onmouseout="untriggerLineHotspot(85);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(85); return false;"><img id="lnhs-85" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-2#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">resultReader</span>&nbsp;!=&nbsp;<span class="kw">null</span>)&nbsp;{</pre></div><div class="line" id="line-86"><div class="lnml" id="lnml-86"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(86);" onmouseout="untriggerLineHotspot(86);"><pre><a name="86" href="#86">86</a></pre></div><div class="lnmr" id="lnmr-86" onmouseover="triggerLineHotspot(86);" onmouseout="untriggerLineHotspot(86);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(86); return false;"><img id="lnhs-86" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-2#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">resultReader</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/BufferedReader.java#BufferedReader.close%28%29" title="java.io.BufferedReader.close() : void">close</a>();</pre></div><div class="line" id="line-87"><div class="lnml" id="lnml-87"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(87);" onmouseout="untriggerLineHotspot(87);"><pre><a name="87" href="#87">87</a></pre></div><div class="lnmr" id="lnmr-87" onmouseover="triggerLineHotspot(87);" onmouseout="untriggerLineHotspot(87);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(87); return false;"><img id="lnhs-87" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-88"><div class="lnml" id="lnml-88"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(88);" onmouseout="untriggerLineHotspot(88);"><pre><a name="88" href="#88">88</a></pre></div><div class="lnmr" id="lnmr-88" onmouseover="triggerLineHotspot(88);" onmouseout="untriggerLineHotspot(88);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(88); return false;"><img id="lnhs-88" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-1#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">p</span>&nbsp;!=&nbsp;<span class="kw">null</span>)&nbsp;{</pre></div><div class="line" id="line-89"><div class="lnml" id="lnml-89"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(89);" onmouseout="untriggerLineHotspot(89);"><pre><a name="89" href="#89">89</a></pre></div><div class="lnmr" id="lnmr-89" onmouseover="triggerLineHotspot(89);" onmouseout="untriggerLineHotspot(89);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(89); return false;"><img id="lnhs-89" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-1#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">p</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Process.java#Process.destroy%28%29" title="java.lang.Process.destroy() : void">destroy</a>();</pre></div><div class="line" id="line-90"><div class="lnml" id="lnml-90"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(90);" onmouseout="untriggerLineHotspot(90);"><pre><a name="90" href="#90">90</a></pre></div><div class="lnmr" id="lnmr-90" onmouseover="triggerLineHotspot(90);" onmouseout="untriggerLineHotspot(90);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(90); return false;"><img id="lnhs-90" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-91"><div class="lnml" id="lnml-91"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(91);" onmouseout="untriggerLineHotspot(91);"><pre><a name="91" href="#91">91</a></pre></div><div class="lnmr" id="lnmr-91" onmouseover="triggerLineHotspot(91);" onmouseout="untriggerLineHotspot(91);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(91); return false;"><img id="lnhs-91" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">catch</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/IOException.java#IOException" title="java.io.IOException">IOException</a>&nbsp;<span class="mark-7#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">e</span>)&nbsp;{</pre></div><div class="line" id="line-92"><div class="lnml" id="lnml-92"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(92);" onmouseout="untriggerLineHotspot(92);"><pre><a name="92" href="#92">92</a></pre></div><div class="lnmr" id="lnmr-92" onmouseover="triggerLineHotspot(92);" onmouseout="untriggerLineHotspot(92);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(92); return false;"><img id="lnhs-92" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">System</a>.<span class="mark-4#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/System.java#System.0err" title="PrintStream err" class="hidden">err</a></span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/PrintStream.java#PrintStream.println%28java.lang.String%29" title="java.io.PrintStream.println(java.lang.String) : void">println</a>(<span class="mark-7#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">e</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Throwable.java#Throwable.toString%28%29" title="java.lang.Throwable.toString() : String">toString</a>());</pre></div><div class="line" id="line-93"><div class="lnml" id="lnml-93"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(93);" onmouseout="untriggerLineHotspot(93);"><pre><a name="93" href="#93">93</a></pre></div><div class="lnmr" id="lnmr-93" onmouseover="triggerLineHotspot(93);" onmouseout="untriggerLineHotspot(93);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(93); return false;"><img id="lnhs-93" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-94"><div class="lnml" id="lnml-94"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(94);" onmouseout="untriggerLineHotspot(94);"><pre><a name="94" href="#94">94</a></pre></div><div class="lnmr" id="lnmr-94" onmouseover="triggerLineHotspot(94);" onmouseout="untriggerLineHotspot(94);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(94); return false;"><img id="lnhs-94" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-95"><div class="lnml" id="lnml-95"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(95);" onmouseout="untriggerLineHotspot(95);"><pre><a name="95" href="#95">95</a></pre></div><div class="lnmr" id="lnmr-95" onmouseover="triggerLineHotspot(95);" onmouseout="untriggerLineHotspot(95);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(95); return false;"><img id="lnhs-95" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-96"><div class="lnml" id="lnml-96"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(96);" onmouseout="untriggerLineHotspot(96);"><pre><a name="96" href="#96">96</a></pre></div><div class="lnmr" id="lnmr-96" onmouseover="triggerLineHotspot(96);" onmouseout="untriggerLineHotspot(96);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(96); return false;"><img id="lnhs-96" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>}<br/><a name="96"></a></pre></div>
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
<img class='img_base img_jdt_obj16_package_obj' src='/static/app/images/1x1.gif' border='0' title='Package' width='16' height='16'></img>&nbsp;<span class="code">com.android.uiautomator.common.helpers</span><br/>
<img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><img class='img_base img_jdt_ovr16_abstract_co' src='/static/app/images/1x1.gif' border='0' title='Abstract' width='7' height='8'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:3px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java#AppHelperBase" title="public abstract class AppHelperBase"><span class="code">AppHelperBase</span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase"></div><br/>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_abstract_co' src='/static/app/images/1x1.gif' border='0' title='Abstract' width='7' height='8'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java#AppHelperBase.isOpen%28%29" title="public abstract boolean isOpen()"><span class="code">isOpen()<span class="returnType"> : boolean</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@isOpen()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_abstract_co' src='/static/app/images/1x1.gif' border='0' title='Abstract' width='7' height='8'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java#AppHelperBase.open%28%29" title="public abstract void open()"><span class="code">open()<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@open()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_protected_co' src='/static/app/images/1x1.gif' border='0' title='Protected Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java#AppHelperBase.runShellCommand%28java.lang.String%29" title="protected void runShellCommand(String)"><span class="code">runShellCommand(String)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@runShellCommand(java.lang.String)"></div><br/></nobr>
</div>
</div>
    </div>
    <div style="display: none;" id="th-view-div">
        <div><div class="type-hierarchy">
<img class='img_base img_jdt_ovr16_focus_ovr' src='/static/app/images/1x1.gif' border='0' title='Focus' width='4' height='10'></img><img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><span class='whitespace'>.</span><b><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/common/helpers/AppHelperBase.java?av=h#AppHelperBase" title="in GrepCode / com.google.android / android / 4.4.4_r1"><span class="code">AppHelperBase</span></a></b><br/>
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
        <div><script language="javascript">registerProfileCompatibility([["gae","Google AppEngine",[["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@<init>()","FULL",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@isOpen()","FULL",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@open()","FULL",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase@runShellCommand(java.lang.String)","FULL",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$common$helpers@AppHelperBase","PARTIAL","!0@!1@!2@java$lang@System"],[]]]])</script></div>
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
