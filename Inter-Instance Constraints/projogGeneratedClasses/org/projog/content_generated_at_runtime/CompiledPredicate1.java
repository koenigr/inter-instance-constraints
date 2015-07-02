package org.projog.content_generated_at_runtime;
import org.projog.core.udp.compiler.*;
import org.projog.core.udp.interpreter.*;
import org.projog.core.udp.*;
import org.projog.core.term.*;
import org.projog.core.*;
import static org.projog.core.term.NumericTermComparator.NUMERIC_TERM_COMPARATOR;
// testRun/1
public final class CompiledPredicate1 implements CompiledPredicate {
   private final boolean initRule0() {
      v0_X = a0;
      return true;
   }
   private final boolean retryRule0() {
      do {
         mainloop:
         switch (conjunctionCtr) {
            case 0:
            if (inlinedCtr0!=0) {
               v0_X = _1;
               _0.backtrack();
            } else {
               _0 = v0_X.getTerm();
            }
            if (inlinedCtr0==0) {
               if (StaticUserDefinedPredicateFactory_1.spyPoint.isEnabled()) {
                  StaticUserDefinedPredicateFactory_1.spyPoint.logCall(StaticUserDefinedPredicateFactory_1, new Term[]{v0_X});
               }
            } else {
               if (StaticUserDefinedPredicateFactory_1.spyPoint.isEnabled()) {
                  StaticUserDefinedPredicateFactory_1.spyPoint.logRedo(StaticUserDefinedPredicateFactory_1, new Term[]{v0_X});
               }
            }
            do {
               if (inlinedCtr0>3) {
                  inlinedCtr0 = 0;
                  if (StaticUserDefinedPredicateFactory_1.spyPoint.isEnabled()) {
                     StaticUserDefinedPredicateFactory_1.spyPoint.logFail(StaticUserDefinedPredicateFactory_1, new Term[]{v0_X});
                  }
                  return false;
               }
               if (_0.unify(StaticUserDefinedPredicateFactory_1.data[inlinedCtr0++])) {
                  if (StaticUserDefinedPredicateFactory_1.spyPoint.isEnabled()) {
                     StaticUserDefinedPredicateFactory_1.spyPoint.logExit(StaticUserDefinedPredicateFactory_1, new Term[]{v0_X});
                  }
                  break;
               } else {
                  _0.backtrack();
               }
            } while (true);
            _1 = v0_X;
            v0_X = v0_X.getTerm();
            return true;
         }
      } while (true);
   }
   public CompiledPredicate1(final KnowledgeBase _kb) {
      s = KnowledgeBaseUtils.getSpyPoints(_kb).getSpyPoint(new PredicateKey("testRun", 1));
      d = false;
      StaticUserDefinedPredicateFactory_1 = (org.projog.core.udp.MultipleRulesWithSingleImmutableArgumentPredicate)((StaticUserDefinedPredicateFactory)_kb.getPredicateFactory(new PredicateKey("test", 1))).getActualPredicateFactory();
   }
   CompiledPredicate1(final Term in0) {
      a0 = in0.getTerm();
      d = s.isEnabled();
   }
   private final void backtrack() {
      a0.backtrack();
   }
   public final boolean evaluate(final Term... args) {
      if (d) {
         if (clauseCtr==0 && !isRetrying) {
            if (d) {
               s.logCall(this, new Term[]{a0});
            }
         } else {
            if (d) {
               s.logRedo(this, new Term[]{a0});
            }
         }
      }
      if (isRetrying) {
         if (retryRule0()) {
            if (d) {
               s.logExit(this, new Term[]{a0});
            }
            return true;
         }
         isRetrying = false;
      } else {
         if (initRule0() && retryRule0()) {
            isRetrying = true;
            if (d) {
               s.logExit(this, new Term[]{a0});
            }
            return true;
         }
      }
      // Fail 1
      if (d) {
         s.logFail(this, new Term[]{a0});
      }
      return false;
   }
   public final boolean isRetryable() {
      return true;
   }
   public final boolean couldReEvaluationSucceed() {
      if (inlinedCtr0<4) {
         return true;
      }
      return false;
   }
   public final void setKnowledgeBase(KnowledgeBase kb) {
      throw new RuntimeException();
   }
   public final Predicate getPredicate(final Term... termArgs) {
      return new CompiledPredicate1(termArgs[0]);
   }
   private static org.projog.core.udp.MultipleRulesWithSingleImmutableArgumentPredicate StaticUserDefinedPredicateFactory_1;
   private static SpyPoints.SpyPoint s;
   private final boolean d;
   private boolean isRetrying;
   private int clauseCtr;
   private int conjunctionCtr;
   private Term a0;
   private Term v0_X;
   private Term _0;
   private Term _1;
   private int inlinedCtr0;
}
