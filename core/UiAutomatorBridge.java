<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html id="html">
    <head>
        <title>GC: UiAutomatorBridge - com.android.uiautomator.core.UiAutomatorBridge (.java) - GrepCode Class Source</title>
        <meta name="verify-v1" content="oDbHfknRLVnvs+1b/O61iSxPEhVr3O08Fd3QqJ1cGh8="/>
        <meta name="verify-v1" content="d2G+nnw2Xr6jBfde7yNvdZirW9Y6K0fa+56zhEmm6YA="/>
        <meta name="msvalidate.01" content="62B5A32F828BC27E3852FB825A5156E4" />
        <meta name="description" content="com.android.uiautomator.core.UiAutomatorBridge"/>
        <meta property="fb:app_id" content="143989634057"/>
        <link rel="canonical" href="http://grepcode.com/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java?av=f"/>
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
    <div id="entityid_hidden" style="display:none">repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core$UiAutomatorBridge.java</div>
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
        <a class="nav" href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.3_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span><img class='img_base img_jdt_elcl16_backward_nav' src='/static/app/images/1x1.gif' border='0' title='4.4.3_r1' width='16' height='16'></img></span></a>
    </span>
    <a title="Version" href="../../../../../../../../../../../snapshot/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/"><span id="current-snapshot">4.4.4_r1</span></a>
    
        <a href="#" class="snapshots-more"
           onclick="this.blur();showSiblings(this);return false;"><img class='img_base img_jdt_elcl16_next_nav' src='/static/app/images/1x1.gif' border='0' title='4.1.1_r1&nbsp;-&nbsp;5.0.0_r1' width='16' height='16'></img></a>
    
    <div class="snapshots-panel" style="visibility: hidden; z-index:2">
        <div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.0.0_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>5.0.0_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.L_preview/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>5.L_preview</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span class="this-snapshot">4.4.4_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.3_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>4.4.3_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.2_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>4.4.2_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.1_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>4.4.1_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>4.4_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3.1_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>4.3.1_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3_r2.1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>4.3_r2.1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>4.3_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.1.1_r1/com/android/uiautomator/core/UiAutomatorBridge.java/"><span>4.1.1_r1</span></a>
        </div>
    </div>
    <span>
        <a class="nav" href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.L_preview/com/android/uiautomator/core/UiAutomatorBridge.java/"><span><img class='img_base img_jdt_elcl16_forward_nav' src='/static/app/images/1x1.gif' border='0' title='5.L_preview' width='16' height='16'></img></span></a>
    </span>
</span></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><span class="entity-name" title="com.android.uiautomator.core.UiAutomatorBridge">com.android.uiautomator.core.UiAutomatorBridge</span></li>
            </ul>
            <div class="entity-header-links">
                
            <!-- Google +1 -->
            <div class="g-plusone" data-size="small" data-annotation="none"></div>
        
                <span><img class='img_base img_jdt_elcl16_search' src='/static/app/images/1x1.gif' border='0' title='Find usages' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../search/usages?id=repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge&amp;type=type&amp;k=u" rel="nofollow" title="Find usages of com.android.uiautomator.core.UiAutomatorBridge">Find Usages</a>
                <span><img class='img_base img_jdt_eview16_compare_view' src='/static/app/images/1x1.gif' border='0' title='Diff' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java/?v=diff&amp;id2=4.4.3_r1" rel="nofollow" title="Compare with version 4.4.3_r1">Diff</a>
                <span><img class='img_base img_jdt_obj16_source_editor' src='/static/app/images/1x1.gif' border='0' title='View as plain text' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java/?v=source" rel="nofollow" title="View as plain text">Raw</a>
                <span><img class='img_base img_jdt_elcl16_save' src='/static/app/images/1x1.gif' border='0' title='Download file' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java/?v=source&amp;disposition=attachment" rel="nofollow" title="Download file">Download</a>
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
<div class="line" id="line-1"><div class="lnml" id="lnml-1"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(1);" onmouseout="untriggerLineHotspot(1);"><pre><a name="1" href="#1">1</a></pre></div><div class="lnmr" id="lnmr-1" onmouseover="triggerLineHotspot(1);" onmouseout="untriggerLineHotspot(1);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(1); return false;"><img id="lnhs-1" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="kw">package</span>&nbsp;com.android.uiautomator.core;</pre></div><div class="line" id="line-2"><div class="lnml" id="lnml-2"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(2);" onmouseout="untriggerLineHotspot(2);"><pre><a name="2" href="#2">2</a></pre></div><div class="lnmr" id="lnmr-2" onmouseover="triggerLineHotspot(2);" onmouseout="untriggerLineHotspot(2);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(2); return false;"><img id="lnhs-2" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;</pre></div><div class="line" id="line-3"><div class="lnml" id="lnml-3"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(3);" onmouseout="untriggerLineHotspot(3);"><pre><a name="3" href="#3">3</a></pre></div><div class="lnmr" id="lnmr-3" onmouseover="triggerLineHotspot(3);" onmouseout="untriggerLineHotspot(3);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(3); return false;"><img id="lnhs-3" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/accessibilityservice/AccessibilityServiceInfo.java#AccessibilityServiceInfo" title="android.accessibilityservice.AccessibilityServiceInfo">android.accessibilityservice.AccessibilityServiceInfo</a>;</pre></div><div class="line" id="line-4"><div class="lnml" id="lnml-4"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(4);" onmouseout="untriggerLineHotspot(4);"><pre><a name="4" href="#4">4</a></pre></div><div class="lnmr" id="lnmr-4" onmouseover="triggerLineHotspot(4);" onmouseout="untriggerLineHotspot(4);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(4); return false;"><img id="lnhs-4" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation" title="android.app.UiAutomation">android.app.UiAutomation</a>;</pre></div><div class="line" id="line-5"><div class="lnml" id="lnml-5"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(5);" onmouseout="untriggerLineHotspot(5);"><pre><a name="5" href="#5">5</a></pre></div><div class="lnmr" id="lnmr-5" onmouseover="triggerLineHotspot(5);" onmouseout="untriggerLineHotspot(5);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(5); return false;"><img id="lnhs-5" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.AccessibilityEventFilter" title="android.app.UiAutomation.AccessibilityEventFilter">android.app.UiAutomation.AccessibilityEventFilter</a>;</pre></div><div class="line" id="line-6"><div class="lnml" id="lnml-6"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(6);" onmouseout="untriggerLineHotspot(6);"><pre><a name="6" href="#6">6</a></pre></div><div class="lnmr" id="lnmr-6" onmouseover="triggerLineHotspot(6);" onmouseout="untriggerLineHotspot(6);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(6); return false;"><img id="lnhs-6" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.OnAccessibilityEventListener" title="android.app.UiAutomation.OnAccessibilityEventListener">android.app.UiAutomation.OnAccessibilityEventListener</a>;</pre></div><div class="line" id="line-7"><div class="lnml" id="lnml-7"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(7);" onmouseout="untriggerLineHotspot(7);"><pre><a name="7" href="#7">7</a></pre></div><div class="lnmr" id="lnmr-7" onmouseover="triggerLineHotspot(7);" onmouseout="untriggerLineHotspot(7);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(7); return false;"><img id="lnhs-7" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/graphics/Bitmap.java#Bitmap" title="android.graphics.Bitmap">android.graphics.Bitmap</a>;</pre></div><div class="line" id="line-8"><div class="lnml" id="lnml-8"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(8);" onmouseout="untriggerLineHotspot(8);"><pre><a name="8" href="#8">8</a></pre></div><div class="lnmr" id="lnmr-8" onmouseover="triggerLineHotspot(8);" onmouseout="untriggerLineHotspot(8);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(8); return false;"><img id="lnhs-8" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/util/Log.java#Log" title="android.util.Log">android.util.Log</a>;</pre></div><div class="line" id="line-9"><div class="lnml" id="lnml-9"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(9);" onmouseout="untriggerLineHotspot(9);"><pre><a name="9" href="#9">9</a></pre></div><div class="lnmr" id="lnmr-9" onmouseover="triggerLineHotspot(9);" onmouseout="untriggerLineHotspot(9);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(9); return false;"><img id="lnhs-9" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/view/Display.java#Display" title="android.view.Display">android.view.Display</a>;</pre></div><div class="line" id="line-10"><div class="lnml" id="lnml-10"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(10);" onmouseout="untriggerLineHotspot(10);"><pre><a name="10" href="#10">10</a></pre></div><div class="lnmr" id="lnmr-10" onmouseover="triggerLineHotspot(10);" onmouseout="untriggerLineHotspot(10);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(10); return false;"><img id="lnhs-10" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/view/InputEvent.java#InputEvent" title="android.view.InputEvent">android.view.InputEvent</a>;</pre></div><div class="line" id="line-11"><div class="lnml" id="lnml-11"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(11);" onmouseout="untriggerLineHotspot(11);"><pre><a name="11" href="#11">11</a></pre></div><div class="lnmr" id="lnmr-11" onmouseover="triggerLineHotspot(11);" onmouseout="untriggerLineHotspot(11);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(11); return false;"><img id="lnhs-11" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/view/accessibility/AccessibilityEvent.java#AccessibilityEvent" title="android.view.accessibility.AccessibilityEvent">android.view.accessibility.AccessibilityEvent</a>;</pre></div><div class="line" id="line-12"><div class="lnml" id="lnml-12"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(12);" onmouseout="untriggerLineHotspot(12);"><pre><a name="12" href="#12">12</a></pre></div><div class="lnmr" id="lnmr-12" onmouseover="triggerLineHotspot(12);" onmouseout="untriggerLineHotspot(12);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(12); return false;"><img id="lnhs-12" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/view/accessibility/AccessibilityNodeInfo.java#AccessibilityNodeInfo" title="android.view.accessibility.AccessibilityNodeInfo">android.view.accessibility.AccessibilityNodeInfo</a>;</pre></div><div class="line" id="line-13"><div class="lnml" id="lnml-13"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(13);" onmouseout="untriggerLineHotspot(13);"><pre><a name="13" href="#13">13</a></pre></div><div class="lnmr" id="lnmr-13" onmouseover="triggerLineHotspot(13);" onmouseout="untriggerLineHotspot(13);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(13); return false;"><img id="lnhs-13" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-14"><div class="lnml" id="lnml-14"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(14);" onmouseout="untriggerLineHotspot(14);"><pre><a name="14" href="#14">14</a></pre></div><div class="lnmr" id="lnmr-14" onmouseover="triggerLineHotspot(14);" onmouseout="untriggerLineHotspot(14);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(14); return false;"><img id="lnhs-14" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/BufferedOutputStream.java#BufferedOutputStream" title="java.io.BufferedOutputStream">java.io.BufferedOutputStream</a>;</pre></div><div class="line" id="line-15"><div class="lnml" id="lnml-15"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(15);" onmouseout="untriggerLineHotspot(15);"><pre><a name="15" href="#15">15</a></pre></div><div class="lnmr" id="lnmr-15" onmouseover="triggerLineHotspot(15);" onmouseout="untriggerLineHotspot(15);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(15); return false;"><img id="lnhs-15" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/File.java#File" title="java.io.File">java.io.File</a>;</pre></div><div class="line" id="line-16"><div class="lnml" id="lnml-16"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(16);" onmouseout="untriggerLineHotspot(16);"><pre><a name="16" href="#16">16</a></pre></div><div class="lnmr" id="lnmr-16" onmouseover="triggerLineHotspot(16);" onmouseout="untriggerLineHotspot(16);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(16); return false;"><img id="lnhs-16" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/FileOutputStream.java#FileOutputStream" title="java.io.FileOutputStream">java.io.FileOutputStream</a>;</pre></div><div class="line" id="line-17"><div class="lnml" id="lnml-17"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(17);" onmouseout="untriggerLineHotspot(17);"><pre><a name="17" href="#17">17</a></pre></div><div class="lnmr" id="lnmr-17" onmouseover="triggerLineHotspot(17);" onmouseout="untriggerLineHotspot(17);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(17); return false;"><img id="lnhs-17" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/IOException.java#IOException" title="java.io.IOException">java.io.IOException</a>;</pre></div><div class="line" id="line-18"><div class="lnml" id="lnml-18"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(18);" onmouseout="untriggerLineHotspot(18);"><pre><a name="18" href="#18">18</a></pre></div><div class="lnmr" id="lnmr-18" onmouseover="triggerLineHotspot(18);" onmouseout="untriggerLineHotspot(18);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(18); return false;"><img id="lnhs-18" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">import</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/concurrent/TimeoutException.java#TimeoutException" title="java.util.concurrent.TimeoutException">java.util.concurrent.TimeoutException</a>;<br/><a name="18"></a><br/><a name="19"></a></pre></div><div class="javadoc-area"><div class="javadoc"><a name="20"></a><a name="21"></a> <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key">Hide:</span></dt><dd></dd></dl></div></div></div><div class="line" id="line-22"><div class="lnml" id="lnml-22"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(22);" onmouseout="untriggerLineHotspot(22);"><pre><a name="22" href="#22">22</a></pre></div><div class="lnmr" id="lnmr-22" onmouseover="triggerLineHotspot(22);" onmouseout="untriggerLineHotspot(22);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(22); return false;"><img id="lnhs-22" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-23"><div class="lnml" id="lnml-23"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(23);" onmouseout="untriggerLineHotspot(23);"><pre><a name="23" href="#23">23</a></pre></div><div class="lnmr" id="lnmr-23" onmouseover="triggerLineHotspot(23);" onmouseout="untriggerLineHotspot(23);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(23); return false;"><img id="lnhs-23" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">abstract</span>&nbsp;<span class="kw">class</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'type','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge">UiAutomatorBridge</a>&nbsp;{</pre></div><div class="line" id="line-24"><div class="lnml" id="lnml-24"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(24);" onmouseout="untriggerLineHotspot(24);"><pre><a name="24" href="#24">24</a></pre></div><div class="lnmr" id="lnmr-24" onmouseover="triggerLineHotspot(24);" onmouseout="untriggerLineHotspot(24);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(24); return false;"><img id="lnhs-24" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-25"><div class="lnml" id="lnml-25"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(25);" onmouseout="untriggerLineHotspot(25);"><pre><a name="25" href="#25">25</a></pre></div><div class="lnmr" id="lnmr-25" onmouseover="triggerLineHotspot(25);" onmouseout="untriggerLineHotspot(25);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(25); return false;"><img id="lnhs-25" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">static</span>&nbsp;<span class="kw">final</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/String.java#String" title="java.lang.String">String</a>&nbsp;<span class="mark-0#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="UiAutomatorBridge.0LOG_TAG">LOG_TAG</a></span>&nbsp;=&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge" title="com.android.uiautomator.core.UiAutomatorBridge">UiAutomatorBridge</a>.<span class="kw">class</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Class.java#Class.getSimpleName%28%29" title="java.lang.Class.getSimpleName() : String">getSimpleName</a>();<br/><a name="25"></a><br/><a name="26"></a>&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="27"></a><a name="28"></a><a name="29"></a><a name="30"></a> This value has the greatest bearing on the appearance of test execution speeds.
 This value is used as the minimum time to wait before considering the UI idle after
 each action.
 </div></div><div class="line" id="line-31"><div class="lnml" id="lnml-31"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(31);" onmouseout="untriggerLineHotspot(31);"><pre><a name="31" href="#31">31</a></pre></div><div class="lnmr" id="lnmr-31" onmouseover="triggerLineHotspot(31);" onmouseout="untriggerLineHotspot(31);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(31); return false;"><img id="lnhs-31" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-32"><div class="lnml" id="lnml-32"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(32);" onmouseout="untriggerLineHotspot(32);"><pre><a name="32" href="#32">32</a></pre></div><div class="lnmr" id="lnmr-32" onmouseover="triggerLineHotspot(32);" onmouseout="untriggerLineHotspot(32);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(32); return false;"><img id="lnhs-32" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">static</span>&nbsp;<span class="kw">final</span>&nbsp;<span class="kw">long</span>&nbsp;<span class="mark-1#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="UiAutomatorBridge.0QUIET_TIME_TO_BE_CONSIDERD_IDLE_STATE">QUIET_TIME_TO_BE_CONSIDERD_IDLE_STATE</a></span>&nbsp;=&nbsp;500;<span class="comment">//ms</span></pre></div></span><div class="line" id="line-33"><div class="lnml" id="lnml-33"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(33);" onmouseout="untriggerLineHotspot(33);"><pre><a name="33" href="#33">33</a></pre></div><div class="lnmr" id="lnmr-33" onmouseover="triggerLineHotspot(33);" onmouseout="untriggerLineHotspot(33);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(33); return false;"><img id="lnhs-33" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<br/><a name="33"></a>&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="34"></a><a name="35"></a><a name="36"></a><a name="37"></a> This is the maximum time the automation will wait for the UI to go idle. Execution
 will resume normally anyway. This is to prevent waiting forever on display updates
 that may be related to spinning wheels or progress updates of sorts etc...
 </div></div><div class="line" id="line-38"><div class="lnml" id="lnml-38"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(38);" onmouseout="untriggerLineHotspot(38);"><pre><a name="38" href="#38">38</a></pre></div><div class="lnmr" id="lnmr-38" onmouseover="triggerLineHotspot(38);" onmouseout="untriggerLineHotspot(38);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(38); return false;"><img id="lnhs-38" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-39"><div class="lnml" id="lnml-39"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(39);" onmouseout="untriggerLineHotspot(39);"><pre><a name="39" href="#39">39</a></pre></div><div class="lnmr" id="lnmr-39" onmouseover="triggerLineHotspot(39);" onmouseout="untriggerLineHotspot(39);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(39); return false;"><img id="lnhs-39" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">static</span>&nbsp;<span class="kw">final</span>&nbsp;<span class="kw">long</span>&nbsp;<span class="mark-2#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="UiAutomatorBridge.0TOTAL_TIME_TO_WAIT_FOR_IDLE_STATE">TOTAL_TIME_TO_WAIT_FOR_IDLE_STATE</a></span>&nbsp;=&nbsp;1000&nbsp;*&nbsp;10;<span class="comment">//ms</span></pre></div></span><div class="line" id="line-40"><div class="lnml" id="lnml-40"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(40);" onmouseout="untriggerLineHotspot(40);"><pre><a name="40" href="#40">40</a></pre></div><div class="lnmr" id="lnmr-40" onmouseover="triggerLineHotspot(40);" onmouseout="untriggerLineHotspot(40);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(40); return false;"><img id="lnhs-40" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-41"><div class="lnml" id="lnml-41"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(41);" onmouseout="untriggerLineHotspot(41);"><pre><a name="41" href="#41">41</a></pre></div><div class="lnmr" id="lnmr-41" onmouseover="triggerLineHotspot(41);" onmouseout="untriggerLineHotspot(41);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(41); return false;"><img id="lnhs-41" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">final</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation" title="android.app.UiAutomation">UiAutomation</a>&nbsp;<span class="mark-3#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="UiAutomatorBridge.0mUiAutomation">mUiAutomation</a></span>;</pre></div><div class="line" id="line-42"><div class="lnml" id="lnml-42"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(42);" onmouseout="untriggerLineHotspot(42);"><pre><a name="42" href="#42">42</a></pre></div><div class="lnmr" id="lnmr-42" onmouseover="triggerLineHotspot(42);" onmouseout="untriggerLineHotspot(42);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(42); return false;"><img id="lnhs-42" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-43"><div class="lnml" id="lnml-43"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(43);" onmouseout="untriggerLineHotspot(43);"><pre><a name="43" href="#43">43</a></pre></div><div class="lnmr" id="lnmr-43" onmouseover="triggerLineHotspot(43);" onmouseout="untriggerLineHotspot(43);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(43); return false;"><img id="lnhs-43" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">final</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/InteractionController.java#InteractionController" title="com.android.uiautomator.core.InteractionController">InteractionController</a>&nbsp;<span class="mark-4#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="UiAutomatorBridge.0mInteractionController">mInteractionController</a></span>;</pre></div><div class="line" id="line-44"><div class="lnml" id="lnml-44"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(44);" onmouseout="untriggerLineHotspot(44);"><pre><a name="44" href="#44">44</a></pre></div><div class="lnmr" id="lnmr-44" onmouseover="triggerLineHotspot(44);" onmouseout="untriggerLineHotspot(44);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(44); return false;"><img id="lnhs-44" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-45"><div class="lnml" id="lnml-45"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(45);" onmouseout="untriggerLineHotspot(45);"><pre><a name="45" href="#45">45</a></pre></div><div class="lnmr" id="lnmr-45" onmouseover="triggerLineHotspot(45);" onmouseout="untriggerLineHotspot(45);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(45); return false;"><img id="lnhs-45" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">final</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/QueryController.java#QueryController" title="com.android.uiautomator.core.QueryController">QueryController</a>&nbsp;<span class="mark-5#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="UiAutomatorBridge.0mQueryController">mQueryController</a></span>;</pre></div><div class="line" id="line-46"><div class="lnml" id="lnml-46"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(46);" onmouseout="untriggerLineHotspot(46);"><pre><a name="46" href="#46">46</a></pre></div><div class="lnmr" id="lnmr-46" onmouseover="triggerLineHotspot(46);" onmouseout="untriggerLineHotspot(46);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(46); return false;"><img id="lnhs-46" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-47"><div class="lnml" id="lnml-47"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(47);" onmouseout="untriggerLineHotspot(47);"><pre><a name="47" href="#47">47</a></pre></div><div class="lnmr" id="lnmr-47" onmouseover="triggerLineHotspot(47);" onmouseout="untriggerLineHotspot(47);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(47); return false;"><img id="lnhs-47" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@<init>(android.app.UiAutomation)',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.%3Cinit%3E%28android.app.UiAutomation%29">UiAutomatorBridge</a>(<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation" title="android.app.UiAutomation">UiAutomation</a>&nbsp;<span class="mark-6#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">uiAutomation</span>)&nbsp;{</pre></div><div class="line" id="line-48"><div class="lnml" id="lnml-48"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(48);" onmouseout="untriggerLineHotspot(48);"><pre><a name="48" href="#48">48</a></pre></div><div class="lnmr" id="lnmr-48" onmouseover="triggerLineHotspot(48);" onmouseout="untriggerLineHotspot(48);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(48); return false;"><img id="lnhs-48" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-3#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>&nbsp;=&nbsp;<span class="mark-6#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">uiAutomation</span>;</pre></div><div class="line" id="line-49"><div class="lnml" id="lnml-49"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(49);" onmouseout="untriggerLineHotspot(49);"><pre><a name="49" href="#49">49</a></pre></div><div class="lnmr" id="lnmr-49" onmouseover="triggerLineHotspot(49);" onmouseout="untriggerLineHotspot(49);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(49); return false;"><img id="lnhs-49" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-4#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mInteractionController" title="InteractionController mInteractionController" class="hidden">mInteractionController</a></span>&nbsp;=&nbsp;<span class="kw">new</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/InteractionController.java#InteractionController" title="com.android.uiautomator.core.InteractionController">InteractionController</a>(<span class="kw">this</span>);</pre></div><div class="line" id="line-50"><div class="lnml" id="lnml-50"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(50);" onmouseout="untriggerLineHotspot(50);"><pre><a name="50" href="#50">50</a></pre></div><div class="lnmr" id="lnmr-50" onmouseover="triggerLineHotspot(50);" onmouseout="untriggerLineHotspot(50);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(50); return false;"><img id="lnhs-50" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-5#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mQueryController" title="QueryController mQueryController" class="hidden">mQueryController</a></span>&nbsp;=&nbsp;<span class="kw">new</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/QueryController.java#QueryController" title="com.android.uiautomator.core.QueryController">QueryController</a>(<span class="kw">this</span>);</pre></div><div class="line" id="line-51"><div class="lnml" id="lnml-51"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(51);" onmouseout="untriggerLineHotspot(51);"><pre><a name="51" href="#51">51</a></pre></div><div class="lnmr" id="lnmr-51" onmouseover="triggerLineHotspot(51);" onmouseout="untriggerLineHotspot(51);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(51); return false;"><img id="lnhs-51" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-52"><div class="lnml" id="lnml-52"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(52);" onmouseout="untriggerLineHotspot(52);"><pre><a name="52" href="#52">52</a></pre></div><div class="lnmr" id="lnmr-52" onmouseover="triggerLineHotspot(52);" onmouseout="untriggerLineHotspot(52);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(52); return false;"><img id="lnhs-52" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-53"><div class="lnml" id="lnml-53"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(53);" onmouseout="untriggerLineHotspot(53);"><pre><a name="53" href="#53">53</a></pre></div><div class="lnmr" id="lnmr-53" onmouseover="triggerLineHotspot(53);" onmouseout="untriggerLineHotspot(53);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(53); return false;"><img id="lnhs-53" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/InteractionController.java#InteractionController" title="com.android.uiautomator.core.InteractionController">InteractionController</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getInteractionController()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.getInteractionController%28%29">getInteractionController</a>()&nbsp;{</pre></div><div class="line" id="line-54"><div class="lnml" id="lnml-54"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(54);" onmouseout="untriggerLineHotspot(54);"><pre><a name="54" href="#54">54</a></pre></div><div class="lnmr" id="lnmr-54" onmouseover="triggerLineHotspot(54);" onmouseout="untriggerLineHotspot(54);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(54); return false;"><img id="lnhs-54" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-4#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mInteractionController" title="InteractionController mInteractionController" class="hidden">mInteractionController</a></span>;</pre></div><div class="line" id="line-55"><div class="lnml" id="lnml-55"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(55);" onmouseout="untriggerLineHotspot(55);"><pre><a name="55" href="#55">55</a></pre></div><div class="lnmr" id="lnmr-55" onmouseover="triggerLineHotspot(55);" onmouseout="untriggerLineHotspot(55);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(55); return false;"><img id="lnhs-55" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-56"><div class="lnml" id="lnml-56"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(56);" onmouseout="untriggerLineHotspot(56);"><pre><a name="56" href="#56">56</a></pre></div><div class="lnmr" id="lnmr-56" onmouseover="triggerLineHotspot(56);" onmouseout="untriggerLineHotspot(56);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(56); return false;"><img id="lnhs-56" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-57"><div class="lnml" id="lnml-57"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(57);" onmouseout="untriggerLineHotspot(57);"><pre><a name="57" href="#57">57</a></pre></div><div class="lnmr" id="lnmr-57" onmouseover="triggerLineHotspot(57);" onmouseout="untriggerLineHotspot(57);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(57); return false;"><img id="lnhs-57" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/QueryController.java#QueryController" title="com.android.uiautomator.core.QueryController">QueryController</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getQueryController()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.getQueryController%28%29">getQueryController</a>()&nbsp;{</pre></div><div class="line" id="line-58"><div class="lnml" id="lnml-58"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(58);" onmouseout="untriggerLineHotspot(58);"><pre><a name="58" href="#58">58</a></pre></div><div class="lnmr" id="lnmr-58" onmouseover="triggerLineHotspot(58);" onmouseout="untriggerLineHotspot(58);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(58); return false;"><img id="lnhs-58" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-5#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mQueryController" title="QueryController mQueryController" class="hidden">mQueryController</a></span>;</pre></div><div class="line" id="line-59"><div class="lnml" id="lnml-59"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(59);" onmouseout="untriggerLineHotspot(59);"><pre><a name="59" href="#59">59</a></pre></div><div class="lnmr" id="lnmr-59" onmouseover="triggerLineHotspot(59);" onmouseout="untriggerLineHotspot(59);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(59); return false;"><img id="lnhs-59" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-60"><div class="lnml" id="lnml-60"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(60);" onmouseout="untriggerLineHotspot(60);"><pre><a name="60" href="#60">60</a></pre></div><div class="lnmr" id="lnmr-60" onmouseover="triggerLineHotspot(60);" onmouseout="untriggerLineHotspot(60);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(60); return false;"><img id="lnhs-60" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-61"><div class="lnml" id="lnml-61"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(61);" onmouseout="untriggerLineHotspot(61);"><pre><a name="61" href="#61">61</a></pre></div><div class="lnmr" id="lnmr-61" onmouseover="triggerLineHotspot(61);" onmouseout="untriggerLineHotspot(61);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(61); return false;"><img id="lnhs-61" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@setOnAccessibilityEventListener(android.app.UiAutomation.OnAccessibilityEventListener)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.setOnAccessibilityEventListener%28android.app.UiAutomation.OnAccessibilityEventListener%29">setOnAccessibilityEventListener</a>(<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.OnAccessibilityEventListener" title="android.app.UiAutomation.OnAccessibilityEventListener">OnAccessibilityEventListener</a>&nbsp;<span class="mark-7#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">listener</span>)&nbsp;{</pre></div><div class="line" id="line-62"><div class="lnml" id="lnml-62"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(62);" onmouseout="untriggerLineHotspot(62);"><pre><a name="62" href="#62">62</a></pre></div><div class="lnmr" id="lnmr-62" onmouseover="triggerLineHotspot(62);" onmouseout="untriggerLineHotspot(62);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(62); return false;"><img id="lnhs-62" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.setOnAccessibilityEventListener%28android.app.UiAutomation.OnAccessibilityEventListener%29" title="android.app.UiAutomation.setOnAccessibilityEventListener(android.app.UiAutomation.OnAccessibilityEventListener) : void">setOnAccessibilityEventListener</a>(<span class="mark-7#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">listener</span>);</pre></div><div class="line" id="line-63"><div class="lnml" id="lnml-63"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(63);" onmouseout="untriggerLineHotspot(63);"><pre><a name="63" href="#63">63</a></pre></div><div class="lnmr" id="lnmr-63" onmouseover="triggerLineHotspot(63);" onmouseout="untriggerLineHotspot(63);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(63); return false;"><img id="lnhs-63" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-64"><div class="lnml" id="lnml-64"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(64);" onmouseout="untriggerLineHotspot(64);"><pre><a name="64" href="#64">64</a></pre></div><div class="lnmr" id="lnmr-64" onmouseover="triggerLineHotspot(64);" onmouseout="untriggerLineHotspot(64);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(64); return false;"><img id="lnhs-64" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-65"><div class="lnml" id="lnml-65"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(65);" onmouseout="untriggerLineHotspot(65);"><pre><a name="65" href="#65">65</a></pre></div><div class="lnmr" id="lnmr-65" onmouseover="triggerLineHotspot(65);" onmouseout="untriggerLineHotspot(65);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(65); return false;"><img id="lnhs-65" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/view/accessibility/AccessibilityNodeInfo.java#AccessibilityNodeInfo" title="android.view.accessibility.AccessibilityNodeInfo">AccessibilityNodeInfo</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getRootInActiveWindow()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.getRootInActiveWindow%28%29">getRootInActiveWindow</a>()&nbsp;{</pre></div><div class="line" id="line-66"><div class="lnml" id="lnml-66"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(66);" onmouseout="untriggerLineHotspot(66);"><pre><a name="66" href="#66">66</a></pre></div><div class="lnmr" id="lnmr-66" onmouseover="triggerLineHotspot(66);" onmouseout="untriggerLineHotspot(66);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(66); return false;"><img id="lnhs-66" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.getRootInActiveWindow%28%29" title="android.app.UiAutomation.getRootInActiveWindow() : AccessibilityNodeInfo">getRootInActiveWindow</a>();</pre></div><div class="line" id="line-67"><div class="lnml" id="lnml-67"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(67);" onmouseout="untriggerLineHotspot(67);"><pre><a name="67" href="#67">67</a></pre></div><div class="lnmr" id="lnmr-67" onmouseover="triggerLineHotspot(67);" onmouseout="untriggerLineHotspot(67);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(67); return false;"><img id="lnhs-67" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-68"><div class="lnml" id="lnml-68"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(68);" onmouseout="untriggerLineHotspot(68);"><pre><a name="68" href="#68">68</a></pre></div><div class="lnmr" id="lnmr-68" onmouseover="triggerLineHotspot(68);" onmouseout="untriggerLineHotspot(68);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(68); return false;"><img id="lnhs-68" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-69"><div class="lnml" id="lnml-69"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(69);" onmouseout="untriggerLineHotspot(69);"><pre><a name="69" href="#69">69</a></pre></div><div class="lnmr" id="lnmr-69" onmouseover="triggerLineHotspot(69);" onmouseout="untriggerLineHotspot(69);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(69); return false;"><img id="lnhs-69" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">boolean</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@injectInputEvent(android.view.InputEvent,boolean)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.injectInputEvent%28android.view.InputEvent%2Cboolean%29">injectInputEvent</a>(<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/view/InputEvent.java#InputEvent" title="android.view.InputEvent">InputEvent</a>&nbsp;<span class="mark-8#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">event</span>,&nbsp;<span class="kw">boolean</span>&nbsp;<span class="mark-9#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">sync</span>)&nbsp;{</pre></div><div class="line" id="line-70"><div class="lnml" id="lnml-70"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(70);" onmouseout="untriggerLineHotspot(70);"><pre><a name="70" href="#70">70</a></pre></div><div class="lnmr" id="lnmr-70" onmouseover="triggerLineHotspot(70);" onmouseout="untriggerLineHotspot(70);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(70); return false;"><img id="lnhs-70" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.injectInputEvent%28android.view.InputEvent%2Cboolean%29" title="android.app.UiAutomation.injectInputEvent(android.view.InputEvent,boolean) : boolean">injectInputEvent</a>(<span class="mark-8#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">event</span>,&nbsp;<span class="mark-9#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">sync</span>);</pre></div><div class="line" id="line-71"><div class="lnml" id="lnml-71"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(71);" onmouseout="untriggerLineHotspot(71);"><pre><a name="71" href="#71">71</a></pre></div><div class="lnmr" id="lnmr-71" onmouseover="triggerLineHotspot(71);" onmouseout="untriggerLineHotspot(71);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(71); return false;"><img id="lnhs-71" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-72"><div class="lnml" id="lnml-72"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(72);" onmouseout="untriggerLineHotspot(72);"><pre><a name="72" href="#72">72</a></pre></div><div class="lnmr" id="lnmr-72" onmouseover="triggerLineHotspot(72);" onmouseout="untriggerLineHotspot(72);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(72); return false;"><img id="lnhs-72" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-73"><div class="lnml" id="lnml-73"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(73);" onmouseout="untriggerLineHotspot(73);"><pre><a name="73" href="#73">73</a></pre></div><div class="lnmr" id="lnmr-73" onmouseover="triggerLineHotspot(73);" onmouseout="untriggerLineHotspot(73);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(73); return false;"><img id="lnhs-73" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">boolean</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@setRotation(int)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.setRotation%28int%29">setRotation</a>(<span class="kw">int</span>&nbsp;<span class="mark-10#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">rotation</span>)&nbsp;{</pre></div><div class="line" id="line-74"><div class="lnml" id="lnml-74"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(74);" onmouseout="untriggerLineHotspot(74);"><pre><a name="74" href="#74">74</a></pre></div><div class="lnmr" id="lnmr-74" onmouseover="triggerLineHotspot(74);" onmouseout="untriggerLineHotspot(74);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(74); return false;"><img id="lnhs-74" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.setRotation%28int%29" title="android.app.UiAutomation.setRotation(int) : boolean">setRotation</a>(<span class="mark-10#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">rotation</span>);</pre></div><div class="line" id="line-75"><div class="lnml" id="lnml-75"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(75);" onmouseout="untriggerLineHotspot(75);"><pre><a name="75" href="#75">75</a></pre></div><div class="lnmr" id="lnmr-75" onmouseover="triggerLineHotspot(75);" onmouseout="untriggerLineHotspot(75);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(75); return false;"><img id="lnhs-75" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-76"><div class="lnml" id="lnml-76"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(76);" onmouseout="untriggerLineHotspot(76);"><pre><a name="76" href="#76">76</a></pre></div><div class="lnmr" id="lnmr-76" onmouseover="triggerLineHotspot(76);" onmouseout="untriggerLineHotspot(76);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(76); return false;"><img id="lnhs-76" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-77"><div class="lnml" id="lnml-77"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(77);" onmouseout="untriggerLineHotspot(77);"><pre><a name="77" href="#77">77</a></pre></div><div class="lnmr" id="lnmr-77" onmouseover="triggerLineHotspot(77);" onmouseout="untriggerLineHotspot(77);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(77); return false;"><img id="lnhs-77" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@setCompressedLayoutHierarchy(boolean)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.setCompressedLayoutHierarchy%28boolean%29">setCompressedLayoutHierarchy</a>(<span class="kw">boolean</span>&nbsp;<span class="mark-11#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">compressed</span>)&nbsp;{</pre></div><div class="line" id="line-78"><div class="lnml" id="lnml-78"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(78);" onmouseout="untriggerLineHotspot(78);"><pre><a name="78" href="#78">78</a></pre></div><div class="lnmr" id="lnmr-78" onmouseover="triggerLineHotspot(78);" onmouseout="untriggerLineHotspot(78);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(78); return false;"><img id="lnhs-78" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/accessibilityservice/AccessibilityServiceInfo.java#AccessibilityServiceInfo" title="android.accessibilityservice.AccessibilityServiceInfo">AccessibilityServiceInfo</a>&nbsp;<span class="mark-12#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">info</span>&nbsp;=&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.getServiceInfo%28%29" title="android.app.UiAutomation.getServiceInfo() : AccessibilityServiceInfo">getServiceInfo</a>();</pre></div><div class="line" id="line-79"><div class="lnml" id="lnml-79"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(79);" onmouseout="untriggerLineHotspot(79);"><pre><a name="79" href="#79">79</a></pre></div><div class="lnmr" id="lnmr-79" onmouseover="triggerLineHotspot(79);" onmouseout="untriggerLineHotspot(79);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(79); return false;"><img id="lnhs-79" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-11#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">compressed</span>)</pre></div><div class="line" id="line-80"><div class="lnml" id="lnml-80"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(80);" onmouseout="untriggerLineHotspot(80);"><pre><a name="80" href="#80">80</a></pre></div><div class="lnmr" id="lnmr-80" onmouseover="triggerLineHotspot(80);" onmouseout="untriggerLineHotspot(80);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(80); return false;"><img id="lnhs-80" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-12#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">info</span>.<span class="mark-13#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">flags</span>&nbsp;&amp;=&nbsp;~<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/accessibilityservice/AccessibilityServiceInfo.java#AccessibilityServiceInfo.0FLAG_INCLUDE_NOT_IMPORTANT_VIEWS" title="int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS" class="hidden">AccessibilityServiceInfo</a>.<span class="mark-14#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/accessibilityservice/AccessibilityServiceInfo.java#AccessibilityServiceInfo.0FLAG_INCLUDE_NOT_IMPORTANT_VIEWS" title="int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS" class="hidden">FLAG_INCLUDE_NOT_IMPORTANT_VIEWS</a></span>;</pre></div><div class="line" id="line-81"><div class="lnml" id="lnml-81"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(81);" onmouseout="untriggerLineHotspot(81);"><pre><a name="81" href="#81">81</a></pre></div><div class="lnmr" id="lnmr-81" onmouseover="triggerLineHotspot(81);" onmouseout="untriggerLineHotspot(81);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(81); return false;"><img id="lnhs-81" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">else</span></pre></div><div class="line" id="line-82"><div class="lnml" id="lnml-82"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(82);" onmouseout="untriggerLineHotspot(82);"><pre><a name="82" href="#82">82</a></pre></div><div class="lnmr" id="lnmr-82" onmouseover="triggerLineHotspot(82);" onmouseout="untriggerLineHotspot(82);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(82); return false;"><img id="lnhs-82" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-12#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">info</span>.<span class="mark-13#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">flags</span>&nbsp;|=&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/accessibilityservice/AccessibilityServiceInfo.java#AccessibilityServiceInfo.0FLAG_INCLUDE_NOT_IMPORTANT_VIEWS" title="int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS" class="hidden">AccessibilityServiceInfo</a>.<span class="mark-14#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/accessibilityservice/AccessibilityServiceInfo.java#AccessibilityServiceInfo.0FLAG_INCLUDE_NOT_IMPORTANT_VIEWS" title="int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS" class="hidden">FLAG_INCLUDE_NOT_IMPORTANT_VIEWS</a></span>;</pre></div><div class="line" id="line-83"><div class="lnml" id="lnml-83"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(83);" onmouseout="untriggerLineHotspot(83);"><pre><a name="83" href="#83">83</a></pre></div><div class="lnmr" id="lnmr-83" onmouseover="triggerLineHotspot(83);" onmouseout="untriggerLineHotspot(83);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(83); return false;"><img id="lnhs-83" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.setServiceInfo%28android.accessibilityservice.AccessibilityServiceInfo%29" title="android.app.UiAutomation.setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo) : void">setServiceInfo</a>(<span class="mark-12#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">info</span>);</pre></div><div class="line" id="line-84"><div class="lnml" id="lnml-84"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(84);" onmouseout="untriggerLineHotspot(84);"><pre><a name="84" href="#84">84</a></pre></div><div class="lnmr" id="lnmr-84" onmouseover="triggerLineHotspot(84);" onmouseout="untriggerLineHotspot(84);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(84); return false;"><img id="lnhs-84" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-85"><div class="lnml" id="lnml-85"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(85);" onmouseout="untriggerLineHotspot(85);"><pre><a name="85" href="#85">85</a></pre></div><div class="lnmr" id="lnmr-85" onmouseover="triggerLineHotspot(85);" onmouseout="untriggerLineHotspot(85);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(85); return false;"><img id="lnhs-85" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-86"><div class="lnml" id="lnml-86"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(86);" onmouseout="untriggerLineHotspot(86);"><pre><a name="86" href="#86">86</a></pre></div><div class="lnmr" id="lnmr-86" onmouseover="triggerLineHotspot(86);" onmouseout="untriggerLineHotspot(86);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(86); return false;"><img id="lnhs-86" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">abstract</span>&nbsp;<span class="kw">int</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getRotation()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.getRotation%28%29">getRotation</a>();</pre></div><div class="line" id="line-87"><div class="lnml" id="lnml-87"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(87);" onmouseout="untriggerLineHotspot(87);"><pre><a name="87" href="#87">87</a></pre></div><div class="lnmr" id="lnmr-87" onmouseover="triggerLineHotspot(87);" onmouseout="untriggerLineHotspot(87);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(87); return false;"><img id="lnhs-87" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-88"><div class="lnml" id="lnml-88"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(88);" onmouseout="untriggerLineHotspot(88);"><pre><a name="88" href="#88">88</a></pre></div><div class="lnmr" id="lnmr-88" onmouseover="triggerLineHotspot(88);" onmouseout="untriggerLineHotspot(88);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(88); return false;"><img id="lnhs-88" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">abstract</span>&nbsp;<span class="kw">boolean</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@isScreenOn()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.isScreenOn%28%29">isScreenOn</a>();</pre></div><div class="line" id="line-89"><div class="lnml" id="lnml-89"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(89);" onmouseout="untriggerLineHotspot(89);"><pre><a name="89" href="#89">89</a></pre></div><div class="lnmr" id="lnmr-89" onmouseover="triggerLineHotspot(89);" onmouseout="untriggerLineHotspot(89);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(89); return false;"><img id="lnhs-89" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-90"><div class="lnml" id="lnml-90"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(90);" onmouseout="untriggerLineHotspot(90);"><pre><a name="90" href="#90">90</a></pre></div><div class="lnmr" id="lnmr-90" onmouseover="triggerLineHotspot(90);" onmouseout="untriggerLineHotspot(90);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(90); return false;"><img id="lnhs-90" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@waitForIdle()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.waitForIdle%28%29">waitForIdle</a>()&nbsp;{</pre></div><div class="line" id="line-91"><div class="lnml" id="lnml-91"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(91);" onmouseout="untriggerLineHotspot(91);"><pre><a name="91" href="#91">91</a></pre></div><div class="lnmr" id="lnmr-91" onmouseover="triggerLineHotspot(91);" onmouseout="untriggerLineHotspot(91);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(91); return false;"><img id="lnhs-91" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.waitForIdle%28long%29" title="com.android.uiautomator.core.UiAutomatorBridge.waitForIdle(long) : void">waitForIdle</a>(<span class="mark-2#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0TOTAL_TIME_TO_WAIT_FOR_IDLE_STATE" title="long TOTAL_TIME_TO_WAIT_FOR_IDLE_STATE" class="hidden">TOTAL_TIME_TO_WAIT_FOR_IDLE_STATE</a></span>);</pre></div><div class="line" id="line-92"><div class="lnml" id="lnml-92"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(92);" onmouseout="untriggerLineHotspot(92);"><pre><a name="92" href="#92">92</a></pre></div><div class="lnmr" id="lnmr-92" onmouseover="triggerLineHotspot(92);" onmouseout="untriggerLineHotspot(92);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(92); return false;"><img id="lnhs-92" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-93"><div class="lnml" id="lnml-93"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(93);" onmouseout="untriggerLineHotspot(93);"><pre><a name="93" href="#93">93</a></pre></div><div class="lnmr" id="lnmr-93" onmouseover="triggerLineHotspot(93);" onmouseout="untriggerLineHotspot(93);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(93); return false;"><img id="lnhs-93" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-94"><div class="lnml" id="lnml-94"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(94);" onmouseout="untriggerLineHotspot(94);"><pre><a name="94" href="#94">94</a></pre></div><div class="lnmr" id="lnmr-94" onmouseover="triggerLineHotspot(94);" onmouseout="untriggerLineHotspot(94);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(94); return false;"><img id="lnhs-94" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">void</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@waitForIdle(long)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.waitForIdle%28long%29">waitForIdle</a>(<span class="kw">long</span>&nbsp;<span class="mark-15#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>)&nbsp;{</pre></div><div class="line" id="line-95"><div class="lnml" id="lnml-95"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(95);" onmouseout="untriggerLineHotspot(95);"><pre><a name="95" href="#95">95</a></pre></div><div class="lnmr" id="lnmr-95" onmouseover="triggerLineHotspot(95);" onmouseout="untriggerLineHotspot(95);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(95); return false;"><img id="lnhs-95" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">try</span>&nbsp;{</pre></div><div class="line" id="line-96"><div class="lnml" id="lnml-96"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(96);" onmouseout="untriggerLineHotspot(96);"><pre><a name="96" href="#96">96</a></pre></div><div class="lnmr" id="lnmr-96" onmouseover="triggerLineHotspot(96);" onmouseout="untriggerLineHotspot(96);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(96); return false;"><img id="lnhs-96" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.waitForIdle%28long%2Clong%29" title="android.app.UiAutomation.waitForIdle(long,long) : void">waitForIdle</a>(<span class="mark-1#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0QUIET_TIME_TO_BE_CONSIDERD_IDLE_STATE" title="long QUIET_TIME_TO_BE_CONSIDERD_IDLE_STATE" class="hidden">QUIET_TIME_TO_BE_CONSIDERD_IDLE_STATE</a></span>,&nbsp;<span class="mark-15#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>);</pre></div><div class="line" id="line-97"><div class="lnml" id="lnml-97"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(97);" onmouseout="untriggerLineHotspot(97);"><pre><a name="97" href="#97">97</a></pre></div><div class="lnmr" id="lnmr-97" onmouseover="triggerLineHotspot(97);" onmouseout="untriggerLineHotspot(97);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(97); return false;"><img id="lnhs-97" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">catch</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/concurrent/TimeoutException.java#TimeoutException" title="java.util.concurrent.TimeoutException">TimeoutException</a>&nbsp;<span class="mark-16#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">te</span>)&nbsp;{</pre></div><div class="line" id="line-98"><div class="lnml" id="lnml-98"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(98);" onmouseout="untriggerLineHotspot(98);"><pre><a name="98" href="#98">98</a></pre></div><div class="lnmr" id="lnmr-98" onmouseover="triggerLineHotspot(98);" onmouseout="untriggerLineHotspot(98);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(98); return false;"><img id="lnhs-98" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Log.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/util/Log.java#Log.w%28java.lang.String%2Cjava.lang.String%2Cjava.lang.Throwable%29" title="android.util.Log.w(java.lang.String,java.lang.String,java.lang.Throwable) : int">w</a>(<span class="mark-0#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0LOG_TAG" title="String LOG_TAG" class="hidden">LOG_TAG</a></span>,&nbsp;<span class="strliteral">"Could&nbsp;not&nbsp;detect&nbsp;idle&nbsp;state."</span>,&nbsp;<span class="mark-16#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">te</span>);</pre></div><div class="line" id="line-99"><div class="lnml" id="lnml-99"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(99);" onmouseout="untriggerLineHotspot(99);"><pre><a name="99" href="#99">99</a></pre></div><div class="lnmr" id="lnmr-99" onmouseover="triggerLineHotspot(99);" onmouseout="untriggerLineHotspot(99);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(99); return false;"><img id="lnhs-99" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-100"><div class="lnml" id="lnml-100"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(100);" onmouseout="untriggerLineHotspot(100);"><pre><a name="100" href="#100">100</a></pre></div><div class="lnmr" id="lnmr-100" onmouseover="triggerLineHotspot(100);" onmouseout="untriggerLineHotspot(100);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(100); return false;"><img id="lnhs-100" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-101"><div class="lnml" id="lnml-101"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(101);" onmouseout="untriggerLineHotspot(101);"><pre><a name="101" href="#101">101</a></pre></div><div class="lnmr" id="lnmr-101" onmouseover="triggerLineHotspot(101);" onmouseout="untriggerLineHotspot(101);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(101); return false;"><img id="lnhs-101" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-102"><div class="lnml" id="lnml-102"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(102);" onmouseout="untriggerLineHotspot(102);"><pre><a name="102" href="#102">102</a></pre></div><div class="lnmr" id="lnmr-102" onmouseover="triggerLineHotspot(102);" onmouseout="untriggerLineHotspot(102);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(102); return false;"><img id="lnhs-102" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/view/accessibility/AccessibilityEvent.java#AccessibilityEvent" title="android.view.accessibility.AccessibilityEvent">AccessibilityEvent</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@executeCommandAndWaitForAccessibilityEvent(java.lang.Runnable,android.app.UiAutomation.AccessibilityEventFilter,long)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.executeCommandAndWaitForAccessibilityEvent%28java.lang.Runnable%2Candroid.app.UiAutomation.AccessibilityEventFilter%2Clong%29">executeCommandAndWaitForAccessibilityEvent</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/lang/Runnable.java#Runnable" title="java.lang.Runnable">Runnable</a>&nbsp;<span class="mark-17#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">command</span>,</pre></div><div class="line" id="line-103"><div class="lnml" id="lnml-103"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(103);" onmouseout="untriggerLineHotspot(103);"><pre><a name="103" href="#103">103</a></pre></div><div class="lnmr" id="lnmr-103" onmouseover="triggerLineHotspot(103);" onmouseout="untriggerLineHotspot(103);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(103); return false;"><img id="lnhs-103" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.AccessibilityEventFilter" title="android.app.UiAutomation.AccessibilityEventFilter">AccessibilityEventFilter</a>&nbsp;<span class="mark-18#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">filter</span>,&nbsp;<span class="kw">long</span>&nbsp;<span class="mark-19#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeoutMillis</span>)&nbsp;<span class="kw">throws</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/util/concurrent/TimeoutException.java#TimeoutException" title="java.util.concurrent.TimeoutException">TimeoutException</a>&nbsp;{</pre></div><div class="line" id="line-104"><div class="lnml" id="lnml-104"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(104);" onmouseout="untriggerLineHotspot(104);"><pre><a name="104" href="#104">104</a></pre></div><div class="lnmr" id="lnmr-104" onmouseover="triggerLineHotspot(104);" onmouseout="untriggerLineHotspot(104);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(104); return false;"><img id="lnhs-104" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.executeAndWaitForEvent%28java.lang.Runnable%2Candroid.app.UiAutomation.AccessibilityEventFilter%2Clong%29" title="android.app.UiAutomation.executeAndWaitForEvent(java.lang.Runnable,android.app.UiAutomation.AccessibilityEventFilter,long) : AccessibilityEvent">executeAndWaitForEvent</a>(<span class="mark-17#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">command</span>,</pre></div><div class="line" id="line-105"><div class="lnml" id="lnml-105"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(105);" onmouseout="untriggerLineHotspot(105);"><pre><a name="105" href="#105">105</a></pre></div><div class="lnmr" id="lnmr-105" onmouseover="triggerLineHotspot(105);" onmouseout="untriggerLineHotspot(105);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(105); return false;"><img id="lnhs-105" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-18#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">filter</span>,&nbsp;<span class="mark-19#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeoutMillis</span>);</pre></div><div class="line" id="line-106"><div class="lnml" id="lnml-106"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(106);" onmouseout="untriggerLineHotspot(106);"><pre><a name="106" href="#106">106</a></pre></div><div class="lnmr" id="lnmr-106" onmouseover="triggerLineHotspot(106);" onmouseout="untriggerLineHotspot(106);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(106); return false;"><img id="lnhs-106" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-107"><div class="lnml" id="lnml-107"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(107);" onmouseout="untriggerLineHotspot(107);"><pre><a name="107" href="#107">107</a></pre></div><div class="lnmr" id="lnmr-107" onmouseover="triggerLineHotspot(107);" onmouseout="untriggerLineHotspot(107);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(107); return false;"><img id="lnhs-107" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-108"><div class="lnml" id="lnml-108"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(108);" onmouseout="untriggerLineHotspot(108);"><pre><a name="108" href="#108">108</a></pre></div><div class="lnmr" id="lnmr-108" onmouseover="triggerLineHotspot(108);" onmouseout="untriggerLineHotspot(108);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(108); return false;"><img id="lnhs-108" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">boolean</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@takeScreenshot(java.io.File,int)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.takeScreenshot%28java.io.File%2Cint%29">takeScreenshot</a>(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/File.java#File" title="java.io.File">File</a>&nbsp;<span class="mark-20#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">storePath</span>,&nbsp;<span class="kw">int</span>&nbsp;<span class="mark-21#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">quality</span>)&nbsp;{</pre></div><div class="line" id="line-109"><div class="lnml" id="lnml-109"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(109);" onmouseout="untriggerLineHotspot(109);"><pre><a name="109" href="#109">109</a></pre></div><div class="lnmr" id="lnmr-109" onmouseover="triggerLineHotspot(109);" onmouseout="untriggerLineHotspot(109);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(109); return false;"><img id="lnhs-109" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/graphics/Bitmap.java#Bitmap" title="android.graphics.Bitmap">Bitmap</a>&nbsp;<span class="mark-22#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">screenshot</span>&nbsp;=&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.takeScreenshot%28%29" title="android.app.UiAutomation.takeScreenshot() : Bitmap">takeScreenshot</a>();</pre></div><div class="line" id="line-110"><div class="lnml" id="lnml-110"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(110);" onmouseout="untriggerLineHotspot(110);"><pre><a name="110" href="#110">110</a></pre></div><div class="lnmr" id="lnmr-110" onmouseover="triggerLineHotspot(110);" onmouseout="untriggerLineHotspot(110);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(110); return false;"><img id="lnhs-110" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-22#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">screenshot</span>&nbsp;==&nbsp;<span class="kw">null</span>)&nbsp;{</pre></div><div class="line" id="line-111"><div class="lnml" id="lnml-111"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(111);" onmouseout="untriggerLineHotspot(111);"><pre><a name="111" href="#111">111</a></pre></div><div class="lnmr" id="lnmr-111" onmouseover="triggerLineHotspot(111);" onmouseout="untriggerLineHotspot(111);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(111); return false;"><img id="lnhs-111" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="kw">false</span>;</pre></div><div class="line" id="line-112"><div class="lnml" id="lnml-112"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(112);" onmouseout="untriggerLineHotspot(112);"><pre><a name="112" href="#112">112</a></pre></div><div class="lnmr" id="lnmr-112" onmouseover="triggerLineHotspot(112);" onmouseout="untriggerLineHotspot(112);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(112); return false;"><img id="lnhs-112" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-113"><div class="lnml" id="lnml-113"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(113);" onmouseout="untriggerLineHotspot(113);"><pre><a name="113" href="#113">113</a></pre></div><div class="lnmr" id="lnmr-113" onmouseover="triggerLineHotspot(113);" onmouseout="untriggerLineHotspot(113);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(113); return false;"><img id="lnhs-113" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/BufferedOutputStream.java#BufferedOutputStream" title="java.io.BufferedOutputStream">BufferedOutputStream</a>&nbsp;<span class="mark-23#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">bos</span>&nbsp;=&nbsp;<span class="kw">null</span>;</pre></div><div class="line" id="line-114"><div class="lnml" id="lnml-114"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(114);" onmouseout="untriggerLineHotspot(114);"><pre><a name="114" href="#114">114</a></pre></div><div class="lnmr" id="lnmr-114" onmouseover="triggerLineHotspot(114);" onmouseout="untriggerLineHotspot(114);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(114); return false;"><img id="lnhs-114" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">try</span>&nbsp;{</pre></div><div class="line" id="line-115"><div class="lnml" id="lnml-115"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(115);" onmouseout="untriggerLineHotspot(115);"><pre><a name="115" href="#115">115</a></pre></div><div class="lnmr" id="lnmr-115" onmouseover="triggerLineHotspot(115);" onmouseout="untriggerLineHotspot(115);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(115); return false;"><img id="lnhs-115" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-23#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">bos</span>&nbsp;=&nbsp;<span class="kw">new</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/BufferedOutputStream.java#BufferedOutputStream" title="java.io.BufferedOutputStream">BufferedOutputStream</a>(<span class="kw">new</span>&nbsp;<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/FileOutputStream.java#FileOutputStream" title="java.io.FileOutputStream">FileOutputStream</a>(<span class="mark-20#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">storePath</span>));</pre></div><div class="line" id="line-116"><div class="lnml" id="lnml-116"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(116);" onmouseout="untriggerLineHotspot(116);"><pre><a name="116" href="#116">116</a></pre></div><div class="lnmr" id="lnmr-116" onmouseover="triggerLineHotspot(116);" onmouseout="untriggerLineHotspot(116);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(116); return false;"><img id="lnhs-116" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-23#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">bos</span>&nbsp;!=&nbsp;<span class="kw">null</span>)&nbsp;{</pre></div><div class="line" id="line-117"><div class="lnml" id="lnml-117"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(117);" onmouseout="untriggerLineHotspot(117);"><pre><a name="117" href="#117">117</a></pre></div><div class="lnmr" id="lnmr-117" onmouseover="triggerLineHotspot(117);" onmouseout="untriggerLineHotspot(117);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(117); return false;"><img id="lnhs-117" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-22#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">screenshot</span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/graphics/Bitmap.java#Bitmap.compress%28android.graphics.Bitmap.CompressFormat%2Cint%2Cjava.io.OutputStream%29" title="android.graphics.Bitmap.compress(android.graphics.Bitmap.CompressFormat,int,java.io.OutputStream) : boolean">compress</a>(<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/graphics/Bitmap.java#Bitmap.CompressFormat.0PNG" title="CompressFormat PNG" class="hidden">Bitmap</a>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/graphics/Bitmap.java#Bitmap.CompressFormat.0PNG" title="CompressFormat PNG" class="hidden">CompressFormat</a>.<span class="mark-24#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/graphics/Bitmap.java#Bitmap.CompressFormat.0PNG" title="CompressFormat PNG" class="hidden">PNG</a></span>,&nbsp;<span class="mark-21#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">quality</span>,&nbsp;<span class="mark-23#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">bos</span>);</pre></div><div class="line" id="line-118"><div class="lnml" id="lnml-118"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(118);" onmouseout="untriggerLineHotspot(118);"><pre><a name="118" href="#118">118</a></pre></div><div class="lnmr" id="lnmr-118" onmouseover="triggerLineHotspot(118);" onmouseout="untriggerLineHotspot(118);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(118); return false;"><img id="lnhs-118" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-23#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">bos</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/BufferedOutputStream.java#BufferedOutputStream.flush%28%29" title="java.io.BufferedOutputStream.flush() : void">flush</a>();</pre></div><div class="line" id="line-119"><div class="lnml" id="lnml-119"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(119);" onmouseout="untriggerLineHotspot(119);"><pre><a name="119" href="#119">119</a></pre></div><div class="lnmr" id="lnmr-119" onmouseover="triggerLineHotspot(119);" onmouseout="untriggerLineHotspot(119);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(119); return false;"><img id="lnhs-119" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-120"><div class="lnml" id="lnml-120"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(120);" onmouseout="untriggerLineHotspot(120);"><pre><a name="120" href="#120">120</a></pre></div><div class="lnmr" id="lnmr-120" onmouseover="triggerLineHotspot(120);" onmouseout="untriggerLineHotspot(120);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(120); return false;"><img id="lnhs-120" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">catch</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/IOException.java#IOException" title="java.io.IOException">IOException</a>&nbsp;<span class="mark-25#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">ioe</span>)&nbsp;{</pre></div><div class="line" id="line-121"><div class="lnml" id="lnml-121"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(121);" onmouseout="untriggerLineHotspot(121);"><pre><a name="121" href="#121">121</a></pre></div><div class="lnmr" id="lnmr-121" onmouseover="triggerLineHotspot(121);" onmouseout="untriggerLineHotspot(121);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(121); return false;"><img id="lnhs-121" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Log.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/util/Log.java#Log.e%28java.lang.String%2Cjava.lang.String%2Cjava.lang.Throwable%29" title="android.util.Log.e(java.lang.String,java.lang.String,java.lang.Throwable) : int">e</a>(<span class="mark-0#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0LOG_TAG" title="String LOG_TAG" class="hidden">LOG_TAG</a></span>,&nbsp;<span class="strliteral">"failed&nbsp;to&nbsp;save&nbsp;screen&nbsp;shot&nbsp;to&nbsp;file"</span>,&nbsp;<span class="mark-25#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">ioe</span>);</pre></div><div class="line" id="line-122"><div class="lnml" id="lnml-122"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(122);" onmouseout="untriggerLineHotspot(122);"><pre><a name="122" href="#122">122</a></pre></div><div class="lnmr" id="lnmr-122" onmouseover="triggerLineHotspot(122);" onmouseout="untriggerLineHotspot(122);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(122); return false;"><img id="lnhs-122" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="kw">false</span>;</pre></div><div class="line" id="line-123"><div class="lnml" id="lnml-123"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(123);" onmouseout="untriggerLineHotspot(123);"><pre><a name="123" href="#123">123</a></pre></div><div class="lnmr" id="lnmr-123" onmouseover="triggerLineHotspot(123);" onmouseout="untriggerLineHotspot(123);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(123); return false;"><img id="lnhs-123" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">finally</span>&nbsp;{</pre></div><div class="line" id="line-124"><div class="lnml" id="lnml-124"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(124);" onmouseout="untriggerLineHotspot(124);"><pre><a name="124" href="#124">124</a></pre></div><div class="lnmr" id="lnmr-124" onmouseover="triggerLineHotspot(124);" onmouseout="untriggerLineHotspot(124);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(124); return false;"><img id="lnhs-124" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-23#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">bos</span>&nbsp;!=&nbsp;<span class="kw">null</span>)&nbsp;{</pre></div><div class="line" id="line-125"><div class="lnml" id="lnml-125"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(125);" onmouseout="untriggerLineHotspot(125);"><pre><a name="125" href="#125">125</a></pre></div><div class="lnmr" id="lnmr-125" onmouseover="triggerLineHotspot(125);" onmouseout="untriggerLineHotspot(125);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(125); return false;"><img id="lnhs-125" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">try</span>&nbsp;{</pre></div><div class="line" id="line-126"><div class="lnml" id="lnml-126"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(126);" onmouseout="untriggerLineHotspot(126);"><pre><a name="126" href="#126">126</a></pre></div><div class="lnmr" id="lnmr-126" onmouseover="triggerLineHotspot(126);" onmouseout="untriggerLineHotspot(126);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(126); return false;"><img id="lnhs-126" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-23#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">bos</span>.<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/FilterOutputStream.java#FilterOutputStream.close%28%29" title="java.io.FilterOutputStream.close() : void">close</a>();</pre></div><div class="line" id="line-127"><div class="lnml" id="lnml-127"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(127);" onmouseout="untriggerLineHotspot(127);"><pre><a name="127" href="#127">127</a></pre></div><div class="lnmr" id="lnmr-127" onmouseover="triggerLineHotspot(127);" onmouseout="untriggerLineHotspot(127);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(127); return false;"><img id="lnhs-127" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="kw">catch</span>&nbsp;(<a href="/file/repository.grepcode.com/java/root/jdk/openjdk/6-b27/java/io/IOException.java#IOException" title="java.io.IOException">IOException</a>&nbsp;<span class="mark-26#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">ioe</span>)&nbsp;{</pre></div><div class="line" id="line-128"><div class="lnml" id="lnml-128"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(128);" onmouseout="untriggerLineHotspot(128);"><pre><a name="128" href="#128">128</a></pre></div><div class="lnmr" id="lnmr-128" onmouseover="triggerLineHotspot(128);" onmouseout="untriggerLineHotspot(128);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(128); return false;"><img id="lnhs-128" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">/*&nbsp;ignore&nbsp;*/</span></pre></div><div class="line" id="line-129"><div class="lnml" id="lnml-129"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(129);" onmouseout="untriggerLineHotspot(129);"><pre><a name="129" href="#129">129</a></pre></div><div class="lnmr" id="lnmr-129" onmouseover="triggerLineHotspot(129);" onmouseout="untriggerLineHotspot(129);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(129); return false;"><img id="lnhs-129" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-130"><div class="lnml" id="lnml-130"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(130);" onmouseout="untriggerLineHotspot(130);"><pre><a name="130" href="#130">130</a></pre></div><div class="lnmr" id="lnmr-130" onmouseover="triggerLineHotspot(130);" onmouseout="untriggerLineHotspot(130);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(130); return false;"><img id="lnhs-130" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-131"><div class="lnml" id="lnml-131"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(131);" onmouseout="untriggerLineHotspot(131);"><pre><a name="131" href="#131">131</a></pre></div><div class="lnmr" id="lnmr-131" onmouseover="triggerLineHotspot(131);" onmouseout="untriggerLineHotspot(131);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(131); return false;"><img id="lnhs-131" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-22#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">screenshot</span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/graphics/Bitmap.java#Bitmap.recycle%28%29" title="android.graphics.Bitmap.recycle() : void">recycle</a>();</pre></div><div class="line" id="line-132"><div class="lnml" id="lnml-132"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(132);" onmouseout="untriggerLineHotspot(132);"><pre><a name="132" href="#132">132</a></pre></div><div class="lnmr" id="lnmr-132" onmouseover="triggerLineHotspot(132);" onmouseout="untriggerLineHotspot(132);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(132); return false;"><img id="lnhs-132" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-133"><div class="lnml" id="lnml-133"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(133);" onmouseout="untriggerLineHotspot(133);"><pre><a name="133" href="#133">133</a></pre></div><div class="lnmr" id="lnmr-133" onmouseover="triggerLineHotspot(133);" onmouseout="untriggerLineHotspot(133);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(133); return false;"><img id="lnhs-133" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="kw">true</span>;</pre></div><div class="line" id="line-134"><div class="lnml" id="lnml-134"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(134);" onmouseout="untriggerLineHotspot(134);"><pre><a name="134" href="#134">134</a></pre></div><div class="lnmr" id="lnmr-134" onmouseover="triggerLineHotspot(134);" onmouseout="untriggerLineHotspot(134);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(134); return false;"><img id="lnhs-134" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-135"><div class="lnml" id="lnml-135"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(135);" onmouseout="untriggerLineHotspot(135);"><pre><a name="135" href="#135">135</a></pre></div><div class="lnmr" id="lnmr-135" onmouseover="triggerLineHotspot(135);" onmouseout="untriggerLineHotspot(135);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(135); return false;"><img id="lnhs-135" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-136"><div class="lnml" id="lnml-136"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(136);" onmouseout="untriggerLineHotspot(136);"><pre><a name="136" href="#136">136</a></pre></div><div class="lnmr" id="lnmr-136" onmouseover="triggerLineHotspot(136);" onmouseout="untriggerLineHotspot(136);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(136); return false;"><img id="lnhs-136" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">boolean</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@performGlobalAction(int)',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.performGlobalAction%28int%29">performGlobalAction</a>(<span class="kw">int</span>&nbsp;<span class="mark-27#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">action</span>)&nbsp;{</pre></div><div class="line" id="line-137"><div class="lnml" id="lnml-137"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(137);" onmouseout="untriggerLineHotspot(137);"><pre><a name="137" href="#137">137</a></pre></div><div class="lnmr" id="lnmr-137" onmouseover="triggerLineHotspot(137);" onmouseout="untriggerLineHotspot(137);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(137); return false;"><img id="lnhs-137" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="UiAutomation mUiAutomation" class="hidden">mUiAutomation</a></span>.<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/app/UiAutomation.java#UiAutomation.performGlobalAction%28int%29" title="android.app.UiAutomation.performGlobalAction(int) : boolean">performGlobalAction</a>(<span class="mark-27#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">action</span>);</pre></div><div class="line" id="line-138"><div class="lnml" id="lnml-138"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(138);" onmouseout="untriggerLineHotspot(138);"><pre><a name="138" href="#138">138</a></pre></div><div class="lnmr" id="lnmr-138" onmouseover="triggerLineHotspot(138);" onmouseout="untriggerLineHotspot(138);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(138); return false;"><img id="lnhs-138" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-139"><div class="lnml" id="lnml-139"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(139);" onmouseout="untriggerLineHotspot(139);"><pre><a name="139" href="#139">139</a></pre></div><div class="lnmr" id="lnmr-139" onmouseover="triggerLineHotspot(139);" onmouseout="untriggerLineHotspot(139);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(139); return false;"><img id="lnhs-139" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-140"><div class="lnml" id="lnml-140"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(140);" onmouseout="untriggerLineHotspot(140);"><pre><a name="140" href="#140">140</a></pre></div><div class="lnmr" id="lnmr-140" onmouseover="triggerLineHotspot(140);" onmouseout="untriggerLineHotspot(140);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(140); return false;"><img id="lnhs-140" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">abstract</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/android/view/Display.java#Display" title="android.view.Display">Display</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getDefaultDisplay()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.getDefaultDisplay%28%29">getDefaultDisplay</a>();</pre></div><div class="line" id="line-141"><div class="lnml" id="lnml-141"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(141);" onmouseout="untriggerLineHotspot(141);"><pre><a name="141" href="#141">141</a></pre></div><div class="lnmr" id="lnmr-141" onmouseover="triggerLineHotspot(141);" onmouseout="untriggerLineHotspot(141);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(141); return false;"><img id="lnhs-141" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-142"><div class="lnml" id="lnml-142"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(142);" onmouseout="untriggerLineHotspot(142);"><pre><a name="142" href="#142">142</a></pre></div><div class="lnmr" id="lnmr-142" onmouseover="triggerLineHotspot(142);" onmouseout="untriggerLineHotspot(142);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(142); return false;"><img id="lnhs-142" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">abstract</span>&nbsp;<span class="kw">long</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getSystemLongPressTime()',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="UiAutomatorBridge.getSystemLongPressTime%28%29">getSystemLongPressTime</a>();</pre></div><div class="line" id="line-143"><div class="lnml" id="lnml-143"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(143);" onmouseout="untriggerLineHotspot(143);"><pre><a name="143" href="#143">143</a></pre></div><div class="lnmr" id="lnmr-143" onmouseover="triggerLineHotspot(143);" onmouseout="untriggerLineHotspot(143);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(143); return false;"><img id="lnhs-143" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>}<br/><a name="143"></a></pre></div>
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
<img class='img_base img_jdt_obj16_package_obj' src='/static/app/images/1x1.gif' border='0' title='Package' width='16' height='16'></img>&nbsp;<span class="code">com.android.uiautomator.core</span><br/>
<img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><img class='img_base img_jdt_ovr16_abstract_co' src='/static/app/images/1x1.gif' border='0' title='Abstract' width='7' height='8'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:3px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge" title="public abstract class UiAutomatorBridge"><span class="code">UiAutomatorBridge</span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge"></div><br/>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_default_co' src='/static/app/images/1x1.gif' border='0' title='Package Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_constr_ovr' src='/static/app/images/1x1.gif' border='0' title='Constructor' width='7' height='8'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.%3Cinit%3E%28android.app.UiAutomation%29" title="void UiAutomatorBridge(UiAutomation)"><span class="code">UiAutomatorBridge(UiAutomation)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@<init>(android.app.UiAutomation)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.executeCommandAndWaitForAccessibilityEvent%28java.lang.Runnable%2Candroid.app.UiAutomation.AccessibilityEventFilter%2Clong%29" title="public AccessibilityEvent executeCommandAndWaitForAccessibilityEvent(Runnable, UiAutomation.AccessibilityEventFilter, long)"><span class="code">executeCommandAndWaitForAccessibilityEvent(Runnable, UiAutomation.AccessibilityEventFilter, long)<span class="returnType"> : AccessibilityEvent</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@executeCommandAndWaitForAccessibilityEvent(java.lang.Runnable,android.app.UiAutomation.AccessibilityEventFilter,long)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_abstract_co' src='/static/app/images/1x1.gif' border='0' title='Abstract' width='7' height='8'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.getDefaultDisplay%28%29" title="public abstract Display getDefaultDisplay()"><span class="code">getDefaultDisplay()<span class="returnType"> : Display</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getDefaultDisplay()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_default_co' src='/static/app/images/1x1.gif' border='0' title='Package Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.getInteractionController%28%29" title="InteractionController getInteractionController()"><span class="code">getInteractionController()<span class="returnType"> : InteractionController</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getInteractionController()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_default_co' src='/static/app/images/1x1.gif' border='0' title='Package Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.getQueryController%28%29" title="QueryController getQueryController()"><span class="code">getQueryController()<span class="returnType"> : QueryController</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getQueryController()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.getRootInActiveWindow%28%29" title="public AccessibilityNodeInfo getRootInActiveWindow()"><span class="code">getRootInActiveWindow()<span class="returnType"> : AccessibilityNodeInfo</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getRootInActiveWindow()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_abstract_co' src='/static/app/images/1x1.gif' border='0' title='Abstract' width='7' height='8'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.getRotation%28%29" title="public abstract int getRotation()"><span class="code">getRotation()<span class="returnType"> : int</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getRotation()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_abstract_co' src='/static/app/images/1x1.gif' border='0' title='Abstract' width='7' height='8'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.getSystemLongPressTime%28%29" title="public abstract long getSystemLongPressTime()"><span class="code">getSystemLongPressTime()<span class="returnType"> : long</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getSystemLongPressTime()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.injectInputEvent%28android.view.InputEvent%2Cboolean%29" title="public boolean injectInputEvent(InputEvent, boolean)"><span class="code">injectInputEvent(InputEvent, boolean)<span class="returnType"> : boolean</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@injectInputEvent(android.view.InputEvent,boolean)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_abstract_co' src='/static/app/images/1x1.gif' border='0' title='Abstract' width='7' height='8'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.isScreenOn%28%29" title="public abstract boolean isScreenOn()"><span class="code">isScreenOn()<span class="returnType"> : boolean</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@isScreenOn()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.performGlobalAction%28int%29" title="public boolean performGlobalAction(int)"><span class="code">performGlobalAction(int)<span class="returnType"> : boolean</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@performGlobalAction(int)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.setCompressedLayoutHierarchy%28boolean%29" title="public void setCompressedLayoutHierarchy(boolean)"><span class="code">setCompressedLayoutHierarchy(boolean)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@setCompressedLayoutHierarchy(boolean)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.setOnAccessibilityEventListener%28android.app.UiAutomation.OnAccessibilityEventListener%29" title="public void setOnAccessibilityEventListener(UiAutomation.OnAccessibilityEventListener)"><span class="code">setOnAccessibilityEventListener(UiAutomation.OnAccessibilityEventListener)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@setOnAccessibilityEventListener(android.app.UiAutomation.OnAccessibilityEventListener)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.setRotation%28int%29" title="public boolean setRotation(int)"><span class="code">setRotation(int)<span class="returnType"> : boolean</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@setRotation(int)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.takeScreenshot%28java.io.File%2Cint%29" title="public boolean takeScreenshot(File, int)"><span class="code">takeScreenshot(File, int)<span class="returnType"> : boolean</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@takeScreenshot(java.io.File,int)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.waitForIdle%28%29" title="public void waitForIdle()"><span class="code">waitForIdle()<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@waitForIdle()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 29px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.waitForIdle%28long%29" title="public void waitForIdle(long)"><span class="code">waitForIdle(long)<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@waitForIdle(long)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_static_co' src='/static/app/images/1x1.gif' border='0' title='Static' width='7' height='7'></img></sup><sup><img class='img_base img_jdt_ovr16_final_co' src='/static/app/images/1x1.gif' border='0' title='Final' width='7' height='7'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0LOG_TAG" title="private static final String LOG_TAG"><span class="code">LOG_TAG : <span class="returnType">String</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_final_co' src='/static/app/images/1x1.gif' border='0' title='Final' width='7' height='7'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mInteractionController" title="private final InteractionController mInteractionController"><span class="code">mInteractionController : <span class="returnType">InteractionController</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_final_co' src='/static/app/images/1x1.gif' border='0' title='Final' width='7' height='7'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mQueryController" title="private final QueryController mQueryController"><span class="code">mQueryController : <span class="returnType">QueryController</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_final_co' src='/static/app/images/1x1.gif' border='0' title='Final' width='7' height='7'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0mUiAutomation" title="private final UiAutomation mUiAutomation"><span class="code">mUiAutomation : <span class="returnType">UiAutomation</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_static_co' src='/static/app/images/1x1.gif' border='0' title='Static' width='7' height='7'></img></sup><sup><img class='img_base img_jdt_ovr16_final_co' src='/static/app/images/1x1.gif' border='0' title='Final' width='7' height='7'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0QUIET_TIME_TO_BE_CONSIDERD_IDLE_STATE" title="private static final long QUIET_TIME_TO_BE_CONSIDERD_IDLE_STATE"><span class="code">QUIET_TIME_TO_BE_CONSIDERD_IDLE_STATE : <span class="returnType">long</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_static_co' src='/static/app/images/1x1.gif' border='0' title='Static' width='7' height='7'></img></sup><sup><img class='img_base img_jdt_ovr16_final_co' src='/static/app/images/1x1.gif' border='0' title='Final' width='7' height='7'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java#UiAutomatorBridge.0TOTAL_TIME_TO_WAIT_FOR_IDLE_STATE" title="private static final long TOTAL_TIME_TO_WAIT_FOR_IDLE_STATE"><span class="code">TOTAL_TIME_TO_WAIT_FOR_IDLE_STATE : <span class="returnType">long</span></span></a><br/></nobr>
</div>
</div>
    </div>
    <div style="display: none;" id="th-view-div">
        <div><div class="type-hierarchy">
<img class='img_base img_jdt_ovr16_focus_ovr' src='/static/app/images/1x1.gif' border='0' title='Focus' width='4' height='10'></img><img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><span class='whitespace'>.</span><b><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiAutomatorBridge.java?av=h#UiAutomatorBridge" title="in GrepCode / com.google.android / android / 4.4.4_r1"><span class="code">UiAutomatorBridge</span></a></b><br/>
<span class='whitespace'>...</span><span class='whitespace'>...</span><img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><span class='whitespace'>.</span><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/InstrumentationUiAutomatorBridge.java?av=h#InstrumentationUiAutomatorBridge" title="in GrepCode / com.google.android / android / 4.4.4_r1"><span class="code">com.android.uiautomator.core.InstrumentationUiAutomatorBridge</span></a><br/>
<span class='whitespace'>...</span><span class='whitespace'>...</span><img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><span class='whitespace'>.</span><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/ShellUiAutomatorBridge.java?av=h#ShellUiAutomatorBridge" title="in GrepCode / com.google.android / android / 4.4.4_r1"><span class="code">com.android.uiautomator.core.ShellUiAutomatorBridge</span></a><br/>
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
        <div><script language="javascript">registerProfileCompatibility([["gae","Google AppEngine",[["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@<init>(android.app.UiAutomation)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@executeCommandAndWaitForAccessibilityEvent(java.lang.Runnable,android.app.UiAutomation.AccessibilityEventFilter,long)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getDefaultDisplay()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getInteractionController()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getQueryController()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getRootInActiveWindow()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getRotation()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@getSystemLongPressTime()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@injectInputEvent(android.view.InputEvent,boolean)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@isScreenOn()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@performGlobalAction(int)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@setCompressedLayoutHierarchy(boolean)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@setOnAccessibilityEventListener(android.app.UiAutomation.OnAccessibilityEventListener)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@setRotation(int)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@takeScreenshot(java.io.File,int)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@waitForIdle()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge@waitForIdle(long)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@UiAutomatorBridge","NONE","!0@!1@!2@java$io@FileOutputStream"],[]]]])</script></div>
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
